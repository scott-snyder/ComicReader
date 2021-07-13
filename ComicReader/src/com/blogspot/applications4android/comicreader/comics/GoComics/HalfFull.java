package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class HalfFull extends DailyGoComicsCom {
        public HalfFull() {
                super();
                mComicName = "half-full";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2013, 8, 16);
        }
}
