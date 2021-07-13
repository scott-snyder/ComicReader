#/usr/bin/env python3

import bs4
import urllib
import json

site = 'https://www.gocomics.com'
mainurl = site + '/comics/a-to-z'
opener = urllib.request.build_opener()

def cleanupComicFileName (name):
    if name == '(th)ink': return 'Think'
    name = name.replace ('1', 'One')
    name = name.replace ('2', 'Two')
    name = name.replace ('3', 'Three')
    name = name.replace ('4', 'Four')
    name = name.replace ('5', 'Five')
    name = name.replace ('6', 'Six')
    name = name.replace ('7', 'Seven')
    name = name.replace ('8', 'Eight')
    name = name.replace ('9', 'Nine')
    name = name.replace ('0', 'Zero')
    name = name.replace ('@', 'at')
    name = name.replace ('&', 'n')
    name = name.replace (':', '')
    name = name.replace ('!', '')
    name = name.replace ("'", '')
    name = name.replace ('"', '')
    name = name.replace (' ', '')
    name = name.replace ('.', '')
    name = name.replace ('-', '')
    name = name.replace (',', '')
    name = name.replace ('—', '')
    name = name.replace ("’", '')
    return name


def cleanupPrefName (name):
    name = name.replace ('@', 'at')
    name = name.replace ('&', 'n')
    name = name.replace (':', '')
    name = name.replace ('!', '')
    name = name.replace ("'", '')
    name = name.replace ('"', '')
    name = name.replace (' ', '')
    name = name.replace ('.', '')
    name = name.replace ('-', '')
    name = name.replace (',', '')
    name = name.replace ('—', '')
    name = name.replace ("’", '')
    
    return name
    

def getComics():
    data = opener.open (mainurl).read()
    soup = bs4.BeautifulSoup (data, 'lxml')
    out = []
    for link in soup.find_all ('a', 'gc-blended-link'):
        tag = link['href'].split('/')[1]
        title = link.h4.string
        author = None
        if link.span:
            author = link.span.string
            if author.startswith ('By '):
                author = author[3:]
        url = site + link['href']
        out.append ((tag, title, author, url))
    return out


def getStartDate (comic):
    data = opener.open (comic[3]).read()
    soup = bs4.BeautifulSoup (data, 'lxml')
    back = soup.find ('a', 'fa-backward')
    d = back['href'].split('/')
    y = int(d[2])
    m = int(d[3])
    d = int(d[4])
    return (y, m, d)


comics = getComics()
#print (comics)

classes = json.load (open ('ComicReader/assets/classes.json'))
existing = set([x['class'] for x in classes['classes'] if x['class'].startswith('GoComics.') ])

jsonout = open ('classes.json', 'w')

for c in comics:
    fname = cleanupComicFileName (c[1])
    clsname = 'GoComics.' + fname
    if clsname in existing:
        existing.remove (clsname)
        continue

    year, month, day = getStartDate (c)

    cname = c[3].split('/')[3]

    OPEN = '{'
    CLOSE = '}'
    f = open (fname + '.java', 'w')
    print (f"""package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class {fname} extends DailyGoComicsCom {OPEN}
        public {fname}() {OPEN}
                super();
                mComicName = "{cname}";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set({year}, {month-1}, {day});
        {CLOSE}
{CLOSE}""", file=f)
    f.close()

    prefname = cleanupPrefName (cname)
    print (f'   {OPEN}"class":"GoComics.{fname}", "name":"{c[1]}", "pref":"{prefname}Pref"{CLOSE},',
           file = jsonout)

    print (fname)

jsonout.close()

gone = open ('GONE', 'w')
for x in existing:
    print (x, file=gone)
gone.close()

