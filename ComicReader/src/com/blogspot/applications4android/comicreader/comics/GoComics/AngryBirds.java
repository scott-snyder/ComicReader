package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class AngryBirds extends DailyGoComicsCom {
	public AngryBirds() {
		super();
		mComicName = "angry-birds";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2017, 7, 3);
	}
}
