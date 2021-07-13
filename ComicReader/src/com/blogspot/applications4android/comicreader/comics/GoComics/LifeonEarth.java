package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class LifeonEarth extends DailyGoComicsCom {
        public LifeonEarth() {
                super();
                mComicName = "life-on-earth";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2017, 9, 10);
        }
}
