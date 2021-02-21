package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BushyTales extends DailyGoComicsCom {
	public BushyTales() {
		super();
		mComicName = "bushy-tales";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2015, 6, 27);
	}
}
