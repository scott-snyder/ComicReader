package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BrianMcFadden extends DailyGoComicsCom {
        public BrianMcFadden() {
                super();
                mComicName = "brian-mcfadden";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2013, 11, 15);
        }
}
