package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Bacon extends DailyGoComicsCom {
	public Bacon() {
		super();
		mComicName = "bacon";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2016, 6, 17);
	}
}
