package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Bully extends DailyGoComicsCom {
	public Bully() {
		super();
		mComicName = "bully";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2014, 4, 5);
	}
}
