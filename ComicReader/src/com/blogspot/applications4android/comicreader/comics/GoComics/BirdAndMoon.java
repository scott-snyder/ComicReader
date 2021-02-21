package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BirdAndMoon extends DailyGoComicsCom {
	public BirdAndMoon() {
		super();
		mComicName = "bird-and-moon";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2018, 7, 13);
	}
}
