package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class TheDailyDrawing extends DailyGoComicsCom {
	public TheDailyDrawing() {
		super();
		mComicName = "the-daily-drawing";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2015, 0, 19);
	}
}
