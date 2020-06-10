package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class AlisHouse extends DailyGoComicsCom {
	public AlisHouse() {
		super();
		mComicName = "alis-house";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2016, 7, 1);
	}
}
