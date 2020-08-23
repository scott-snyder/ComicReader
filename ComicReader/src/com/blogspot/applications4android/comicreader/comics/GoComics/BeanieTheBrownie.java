package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BeanieTheBrownie extends DailyGoComicsCom {
	public BeanieTheBrownie() {
		super();
		mComicName = "beanie-the-brownie";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2014, 11, 1);
	}
}
