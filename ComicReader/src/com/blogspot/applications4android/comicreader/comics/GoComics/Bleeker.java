package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Bleeker extends DailyGoComicsCom {
	public Bleeker() {
		super();
		mComicName = "bleeker";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2006, 6, 27);
	}
}