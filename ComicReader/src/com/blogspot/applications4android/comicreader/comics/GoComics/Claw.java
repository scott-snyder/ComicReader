package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Claw extends DailyGoComicsCom {
	public Claw() {
		super();
		mComicName = "claw";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2008, 1, 12);
	}
}
