package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BerkeleyMews extends DailyGoComicsCom {
	public BerkeleyMews() {
		super();
		mComicName = "berkeley-mews";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2014, 10, 24);
	}
}
