package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BatchRejection extends DailyGoComicsCom {
	public BatchRejection() {
		super();
		mComicName = "batch-rejection";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2018, 7, 27);
	}
}
