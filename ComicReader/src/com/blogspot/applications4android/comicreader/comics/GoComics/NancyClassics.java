package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class NancyClassics extends DailyGoComicsCom {
        public NancyClassics() {
                super();
                mComicName = "nancy-classics";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 1, 23);
        }
}
