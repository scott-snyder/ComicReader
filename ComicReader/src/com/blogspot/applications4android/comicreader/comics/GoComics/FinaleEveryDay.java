package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class FinaleEveryDay extends DailyGoComicsCom {
	public FinaleEveryDay() {
		super();
		mComicName = "the-comic-strip-that-has-a-finale-every-day";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2015, 0, 1);
	}
}
