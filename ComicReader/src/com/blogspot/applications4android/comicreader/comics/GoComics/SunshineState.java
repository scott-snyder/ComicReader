package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class SunshineState extends DailyGoComicsCom {
        public SunshineState() {
                super();
                mComicName = "sunshine-state";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 5, 2);
        }
}
