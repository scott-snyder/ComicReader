package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class NotInventedHere extends DailyGoComicsCom {
        public NotInventedHere() {
                super();
                mComicName = "not-invented-here";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 11, 28);
        }
}
