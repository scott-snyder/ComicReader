package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Crabgrass extends DailyGoComicsCom {
	public Crabgrass() {
		super();
		mComicName = "crabgrass";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2019, 3, 5);
	}
}
