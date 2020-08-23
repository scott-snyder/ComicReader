package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BearWithMe extends DailyGoComicsCom {
	public BearWithMe() {
		super();
		mComicName = "bear-with-me";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2009, 0, 19);
	}
}
