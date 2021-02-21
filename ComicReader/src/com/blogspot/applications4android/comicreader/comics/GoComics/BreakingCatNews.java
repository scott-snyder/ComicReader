package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BreakingCatNews extends DailyGoComicsCom {
	public BreakingCatNews() {
		super();
		mComicName = "breaking-cat-news";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2010, 0, 1);
	}
}
