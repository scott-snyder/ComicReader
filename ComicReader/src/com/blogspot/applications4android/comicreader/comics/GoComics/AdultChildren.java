package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class AdultChildren extends DailyGoComicsCom {
	public AdultChildren() {
		super();
		mComicName = "adult-children";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2014, 3, 14);
	}
}
