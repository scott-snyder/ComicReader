package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class CatsCafe extends DailyGoComicsCom {
	public CatsCafe() {
		super();
		mComicName = "cats-cafe";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2019, 4, 20);
	}
}
