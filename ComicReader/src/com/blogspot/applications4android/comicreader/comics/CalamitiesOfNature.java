package com.blogspot.applications4android.comicreader.comics;

import java.io.BufferedReader;
import java.io.IOException;

import com.blogspot.applications4android.comicreader.comictypes.IndexedComic;
import com.blogspot.applications4android.comicreader.core.Strip;
import com.blogspot.applications4android.comicreader.exceptions.ComicLatestException;


public class CalamitiesOfNature extends IndexedComic {

	@Override
	protected String getFrontPageUrl() {
		return "https://calamitiesofnature.com/archive";
	}

	@Override
	public String getComicWebPageUrl() {
		return "https://calamitiesofnature.com/";
	}

	@Override
	protected int parseForLatestId(BufferedReader reader) throws IOException, ComicLatestException {
		String str;
		String final_str = null;
		while ((str = reader.readLine()) != null) {
			int index1 = str.indexOf("archive.gif");
			if (index1 != -1) {
				final_str = str;
			}
		}
		if(final_str == null) {
			String msg = "Failed to get the latest id for "+this.getClass().getSimpleName();
			ComicLatestException e = new ComicLatestException(msg);
			throw e;
		}
		final_str = final_str.replaceFirst(".*?href=\"http://www.calamitiesofnature.com/archive/\\?c=","");
		final_str = final_str.replaceAll("\".*","");
	   	int finalid = Integer.parseInt(final_str);
	   	return finalid;
	}


	@Override
	public String getStripUrlFromId(int num) {
		return "https://www.calamitiesofnature.com/archive/?c=" + num;
	}

	@Override
	protected int getIdFromStripUrl(String url) {
		return Integer.parseInt(url.replaceAll("http.*c=", ""));
	}

	@Override
	protected boolean htmlNeeded() {
		return false;
	}

	@Override
	protected String parse(String url, BufferedReader reader, Strip strip)
			throws IOException {
		String url_str = url;
		int currId = Integer.parseInt(url_str.replaceAll("http://www.calamitiesofnature.com/archive/\\?c=", ""));
		strip.setTitle("Calamities Of Nature: " + currId);
		strip.setText("-NA-");
		return "https://www.calamitiesofnature.com/archive/"+currId+".jpg";
	}
}
