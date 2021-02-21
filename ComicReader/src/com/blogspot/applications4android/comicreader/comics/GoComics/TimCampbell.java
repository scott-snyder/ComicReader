package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class TimCampbell extends DailyGoComicsCom {
	public TimCampbell() {
		super();
		mComicName = "tim-campbell";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2017, 6, 1);
	}
}
