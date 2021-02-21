//Added by Crespyl

package com.blogspot.applications4android.comicreader.comics;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.blogspot.applications4android.comicreader.comictypes.YearlyArchivedComic;
import com.blogspot.applications4android.comicreader.core.Strip;

public class ElGoonishShive extends YearlyArchivedComic {

	@Override
	public String getComicWebPageUrl() {
		return "https://www.egscomics.com/";
	}

	@Override
	protected boolean htmlNeeded() {
		return true;
	}

	@Override
	protected String parse(String url, BufferedReader reader, Strip strip)
			throws IOException {
		String line   = reader.readLine();
		String imgUrl = null;
		String title  = null;
		
		Pattern imgPattern = Pattern.compile("comics/.*(jpg|png|gif)");
		
		while((line != null)) {
			
			Matcher urlMatcher = imgPattern.matcher(line);

			if(urlMatcher.find()) {
				imgUrl = "https://www.egscomics.com/"+urlMatcher.group(0);
			}
			
			if(line.matches(".*<title>.*")) {
				title = line.replaceAll(".*<title>", "");
				title = title.replaceAll("</title>", "");
			}
			
			line = reader.readLine();
		}
		
		strip.setText("");
		strip.setTitle(title);
		
		return imgUrl;
	}

	@Override
	protected ArrayList<String> getAllComicUrls(BufferedReader reader, int year)
			throws IOException {
		
		ArrayList<String> urls = new ArrayList<String>();
		Pattern comicUrlPattern = Pattern.compile("date=..........");
		
		String line = null;
		while((line = reader.readLine()) != null) {
			Matcher urlMatcher = comicUrlPattern.matcher(line);
			
			if(line.contains("index.php?date=")) {
				
				while(urlMatcher.find()) {
					urls.add("https://www.egscomics.com/index.php?"+urlMatcher.group());
				}
			}
		}
		
		return urls;
		
	}

	@Override
	protected int getFirstYear() {
		return 2002;
	}

	@Override
	protected String getArchiveUrl(int year) {
		return String.format("https://www.egscomics.com/archives.php?year=%04d&start=0&displaymode=cal",
				year);
	}

	@Override
	protected boolean neededReversal() {
		return false;
	}

}
