package com.blogspot.applications4android.comicreader.comics;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.NoSuchElementException;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import com.blogspot.applications4android.comicreader.comictypes.DailyComic;
import com.blogspot.applications4android.comicreader.core.Bound;
import com.blogspot.applications4android.comicreader.core.Downloader;
import com.blogspot.applications4android.comicreader.core.Strip;

import android.util.Log;

class CADStrip {
  public String mUrl;
  public String mTitle;
  public String mDate;
  public Calendar mCal;

  public CADStrip (String url, String title, String date, Calendar cal)
  {
    mUrl = url;
    mTitle = title;
    mDate = date;
    mCal = cal;
  }
};

public class CtrlAltDel extends DailyComic {
        protected SortedMap<String, TreeMap<Integer, CADStrip> > mMonths;
        protected Calendar mRefreshTime;

  	/**
	 * Constructor
	 */
	public CtrlAltDel() {
          super();
          mMonths = new TreeMap<String, TreeMap<Integer, CADStrip> >();
	}


        @Override
	public String getComicWebPageUrl() {
		return "https://www.cad-comic.com/cad/";
	}

        protected Calendar getFirstCalendar()
        {
          getMonths();
          String month = mMonths.firstKey();
          if (month == null) return null;
          SortedMap<Integer, CADStrip> dlist = getUrlsForMonth (month);
          int d = dlist.firstKey();
          int y = Integer.parseInt (month.substring (0, 4));
          int m = Integer.parseInt (month.substring (4, 6));
          Calendar c = Calendar.getInstance();
          c.set (y, m-1, d);
          return c;
        }


        protected Calendar getLatestCalendar()
        {
          getMonths();
          String month = mMonths.lastKey();
          Log.d ("CAD", "month " + month);
          if (month == null) return null;
          SortedMap<Integer, CADStrip> dlist = getUrlsForMonth (month);
          int d = dlist.lastKey();
          int y = Integer.parseInt (month.substring (0, 4));
          int m = Integer.parseInt (month.substring (4, 6));
          Calendar c = Calendar.getInstance();
          c.set (y, m-1, d);
          return c;
        }

  
        protected Calendar getTimeFromUrl(String url)
        {
          Calendar c = getTimeFromUrl (url, 0);
          if (c != null) {
            return c;
          }
          CADStrip s = getCADStripFromUrl (url);
          if (s != null) {
            return s.mCal;
          }
          return null;
        }
        protected Calendar getTimeFromUrl(String url, int next)
        {
          int i = url.lastIndexOf ("ENG_");
          if (i >= 0) {
            i += 4;
          }
          else {
            i = url.lastIndexOf ("sillies-");
            if (i >= 0) {
              i += 8;
            }
            else {
              i = url.lastIndexOf ("LITE_");
              if (i >= 0) {
                i += 5;
              }
              else {
                i = url.lastIndexOf ("Strip");
                if (i >= 0) {
                  i += 5;
                  int j = url.lastIndexOf ("_");
                  if (j >= 0 && j > i) {
                    //https://cad-comic.com/wp-content/uploads/2020/05/StripXX88_2020515a.x44380.png
                    i = j+1;
                    if (url.substring(i+7,i+8).equals ("a")) {
                      int y = Integer.parseInt (url.substring (i,   i+4));
                      int m = Integer.parseInt (url.substring (i+4, i+5));
                      int d = Integer.parseInt (url.substring (i+5, i+7));
                      Calendar c = Calendar.getInstance();
                      c.set (y, m-1, d);
                      return c;
                    }
                  }
                  else if (url.substring(i+8,i+9).equals("a")) {
                    // https://cad-comic.com/wp-content/uploads/2021/01/Strip20210201aa.png
                      int y = Integer.parseInt (url.substring (i,   i+4));
                      int m = Integer.parseInt (url.substring (i+4, i+6));
                      int d = Integer.parseInt (url.substring (i+6, i+8));
                      Calendar c = Calendar.getInstance();
                      c.set (y, m-1, d);
                      return c;
                  }
                  else {
                    int y = Integer.parseInt (url.substring (i,   i+4));
                    int m = Integer.parseInt (url.substring (i+4, i+5) + url.substring (i+6, i+7));
                    int d = Integer.parseInt (url.substring (i+7, i+9));
                    Calendar c = Calendar.getInstance();
                    c.set (y, m-1, d);
                    return c;
                  }
                }
                else {
                  //https://cad-comic.com/wp-content/uploads/2020/04/SC07_17.x44380.png
                  i = url.lastIndexOf ("/SC");
                  if (i >= 0) {
                    if (next == 0) return null;
                    int y = Integer.parseInt (url.substring (i-7,   i-3));
                    int m = Integer.parseInt (url.substring (i-2,   i));
                    int d = next;
                    Calendar c = Calendar.getInstance();
                    c.set (y, m-1, d);
                    return c;
                  }
                  else {
                    //https://cad-comic.com/wp-content/uploads/2017/03/cad-20021023-87d52.jpg
                    i = url.lastIndexOf ("/cad-");
                    if (i >= 0) {
                      int y = Integer.parseInt (url.substring (i+5,   i+9));
                      int m = Integer.parseInt (url.substring (i+9,   i+11));
                      int d = Integer.parseInt (url.substring (i+11,  i+13));
                      Calendar c = Calendar.getInstance();
                      c.set (y, m-1, d);
                      return c;
                    }
                    return null;
                  }
                }
              }
            }
          }
          int y = Integer.parseInt (url.substring (i,   i+4));
          int m = Integer.parseInt (url.substring (i+4, i+6));
          int d = Integer.parseInt (url.substring (i+6, i+8));
          Calendar c = Calendar.getInstance();
          c.set (y, m-1, d);
          return c;
        }


        private String monthKey(Calendar cal)
        {
          int y = cal.get (Calendar.YEAR);
          int m = cal.get (Calendar.MONTH)+1;
          return String.format ("%04d%02d", y, m);
        }


        public String getUrlFromTime(Calendar cal)
        {
          CADStrip strip = getStripFromTime (cal);
          if (strip == null) return null;
          return strip.mUrl;
        }

	@Override
	protected boolean htmlNeeded() {
		return false;
	}

	@Override
	public void clearCache() {
          mMonths.clear();
          super.clearCache();
	}

	/**
	 * For those days which do not have a comic strip
	 * If the given daily comic series WAS irregular previously but now has been
	 * regular, then you have to override this function!
	 * @param in the calendar which needs to take care of this
	 * @param increment which date needs to be shown instead.
	 */
	public void addException(Calendar in, int increment)
        {
          if (getUrlFromTime (in) != null) return;

          int d = in.get (Calendar.DAY_OF_MONTH);
          String month = monthKey (in);
          SortedMap<Integer, CADStrip> l = getUrlsForMonth (month);
          if (l == null) return;

          if (increment > 0) {
            SortedMap<Integer, CADStrip> tail = l.tailMap (d);
            try {
              d = tail.firstKey();
              in.set (Calendar.DAY_OF_MONTH, d);
              return;
            }
            catch (NoSuchElementException e) {
            }

            in.add (Calendar.MONTH, 1);
            month = monthKey (in);
            l = getUrlsForMonth (month);
            if (l == null) return;
            try {
              d = l.firstKey();
              in.set (Calendar.DAY_OF_MONTH, d);
              return;
            }
            catch (NoSuchElementException e) {
            }
          }
          else { // increment < 0
            SortedMap<Integer, CADStrip> tail = l.headMap (d);
            try {
              d = tail.lastKey();
              in.set (Calendar.DAY_OF_MONTH, d);
              return;
            }
            catch (NoSuchElementException e) {
            }

            in.add (Calendar.MONTH, -1);
            month = monthKey (in);
            l = getUrlsForMonth (month);
            if (l == null) return;
            try {
              d = l.lastKey();
              in.set (Calendar.DAY_OF_MONTH, d);
              return;
            }
            catch (NoSuchElementException e) {
            }
          }
	}


        public CADStrip getStripFromTime(Calendar cal)
        {
          while (true) {
            int d = cal.get (Calendar.DAY_OF_MONTH);
            String month = monthKey (cal);
            getMonths();
            SortedMap<Integer, CADStrip> l = getUrlsForMonth (month);
            if (l == null) {
              return null;
            }
            CADStrip strip = l.get (d);
            if (strip != null) {
              return strip;
            }
            return null;
          }
        }

        protected CADStrip getCADStripFromUrl(String url)
        {
          Calendar c = getTimeFromUrl (url, 0);
          if (c != null) {
            return getStripFromTime (c);
          }
          //https://cad-comic.com/wp-content/uploads/2020/04/SC07_17.x44380.png
          int i = url.lastIndexOf ("/SC");
          if (i >= 0) {
            String yyyymm = url.substring (i-7,   i-3) + url.substring (i-2,   i);
            SortedMap<Integer, CADStrip> map = getUrlsForMonth (yyyymm);
            for (CADStrip s : map.values()) {
              if (s.mUrl.equals (url)) return s;
            }
          }
          return null;
        }


	protected String parse(String url, BufferedReader reader, Strip strip) throws IOException
        {
          CADStrip s = getCADStripFromUrl (url);
          strip.setTitle ("CtrlAltDel for " + s.mDate + ": " + s.mTitle);
          return url;
        }

        ///////

        // List of dates in the form YYYYMM.
        protected SortedMap<String, TreeMap<Integer, CADStrip> > getMonths() {
          Calendar c = Calendar.getInstance();
          if (c.after (mRefreshTime)) {
            mMonths.clear();
          }

          if (mMonths.size() > 0) return mMonths;
          try {
            URI uri = new URI("https://cad-comic.com/wp-admin/admin-ajax.php");
            String data = "action=get_cat_dates&cat_id=all";
            String sdata = Downloader.downloadToString(uri, data);
            JSONObject root = new JSONObject(sdata);
            JSONArray months = root.getJSONArray("months");
            for (int i = 0; i < months.length(); i++) {
              JSONObject o = months.getJSONObject(i);
              mMonths.put (o.getString("post_date"), null);
            }
          }
          catch (Exception e) {
            e.printStackTrace();
          }

          mRefreshTime = Calendar.getInstance();
          mRefreshTime.add (Calendar.HOUR, 1);

          return mMonths;
        }

        protected SortedMap<Integer, CADStrip> getUrlsForMonth (String month)
        {
          Log.d ("CAD", "getUrlsFroMonth " + month);
            getMonths();
            TreeMap<Integer, CADStrip> l = mMonths.get (month);
            try {
              if (l == null) {
                if (mMonths.containsKey (month)) {
                  l = new TreeMap<Integer, CADStrip>();
                  URI uri = new URI("https://cad-comic.com/wp-admin/admin-ajax.php");
                  String data = "action=custom_cat_search&post_cat=all&post_month="+month;
                  String sdata = Downloader.downloadToString(uri, data);
                  Log.d ("CAD", "  sdata " + sdata);
                  JSONObject root = new JSONObject(sdata);
                  JSONArray posts = root.getJSONArray("posts");
                  List<String> ret = new ArrayList<String>();
                  int next = 1;
                  for (int i = posts.length()-1; i >= 0; i--) {
                    JSONObject o = posts.getJSONObject(i);
                    String url = o.getString("comic");
                    Log.d ("CAD", "  got " + url);
                    if (url.lastIndexOf("KDM") >= 0) continue;
                    Calendar c = getTimeFromUrl (url, next);
                    Log.d ("CAD", "     month " + monthKey(c));
                    if (!month.equals (monthKey (c))) {
                      continue;
                    }
                    int dom = c.get (Calendar.DAY_OF_MONTH);
                    next = dom+1;
                    CADStrip strip = new CADStrip (url, o.getString("title"), o.getString("date"), c);
                    l.put (dom, strip);
                  }
                  mMonths.put (month, l);
                }
              }
            }
            catch (Exception e)
            {
              e.printStackTrace();
            }
            return l;
        }
}
