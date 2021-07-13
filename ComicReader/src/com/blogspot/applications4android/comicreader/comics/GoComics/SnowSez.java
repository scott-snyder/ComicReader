package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class SnowSez extends DailyGoComicsCom {
        public SnowSez() {
                super();
                mComicName = "snow-sez";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 9, 12);
        }
}
