package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BackToBC extends DailyGoComicsCom {
	public BackToBC() {
		super();
		mComicName = "back-to-bc";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2015, 7, 31);
	}
}
