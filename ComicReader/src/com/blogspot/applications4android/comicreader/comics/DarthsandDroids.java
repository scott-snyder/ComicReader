package com.blogspot.applications4android.comicreader.comics;

import java.io.BufferedReader;
import java.io.IOException;

import com.blogspot.applications4android.comicreader.comictypes.IndexedComic;
import com.blogspot.applications4android.comicreader.core.Strip;
import com.blogspot.applications4android.comicreader.exceptions.ComicLatestException;



public class DarthsandDroids extends IndexedComic {

	@Override
	protected String getFrontPageUrl() {
		return "https://darthsanddroids.net/";
	}

	@Override
	public String getComicWebPageUrl() {
		return "https://darthsanddroids.net/";
	}

	@Override
	protected int parseForLatestId(BufferedReader reader) throws IOException, ComicLatestException {
		String str;
		String final_str = null;
		while((str = reader.readLine()) != null) {
			int index1 = str.indexOf("alt=\"Episode");
			if (index1 != -1) {
				final_str = str;
			}
		}
		if(final_str == null) {
			String msg = "Failed to get the latest id for "+this.getClass().getSimpleName();
			ComicLatestException e = new ComicLatestException(msg);
			throw e;
		}
    	final_str = final_str.replaceAll(".*Episode ","");
    	final_str = final_str.replaceAll(":.*","");
	    return Integer.parseInt(final_str);
	}

	@Override
	public String getStripUrlFromId(int num) {
		String str;
		if((num < 10)) {
			str = "000" + num;
		} else if((num < 100)) {
			str = "00" + num;
		} else if((num < 1000)) {
			str = "0" + num;
		} else {
			str = "" + num;
		}
		return "https://darthsanddroids.net/episodes/"+str+".html";
	}

	@Override
	protected int getIdFromStripUrl(String url) {
		return Integer.parseInt(url.replaceAll("http.*des/","").replaceAll(".html.*", ""));
	}

	@Override
	protected boolean htmlNeeded() {
		return true;
	}

	@Override
	protected String parse(String url, BufferedReader reader, Strip strip)
			throws IOException {
    	String str;
		String final_str = null;
		String final_title = null;
		while ((str = reader.readLine()) != null) {
			int index1 = str.indexOf("alt=\"Episode ");
			if (index1 != -1) {
				final_str = str;
				final_title = str;
			}
		}
		final_str = final_str.replaceAll(".*src=\"","");
		final_str = final_str.replaceAll("\".*","");
    	final_title = final_title.replaceAll(".*alt=\"","");
    	final_title = final_title.replaceAll("\".*","");
		strip.setTitle(final_title);
		strip.setText("-NA-");
		return "https://darthsanddroids.net/"+final_str;
	}
}
