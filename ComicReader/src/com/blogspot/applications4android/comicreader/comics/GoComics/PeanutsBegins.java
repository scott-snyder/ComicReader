package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class PeanutsBegins extends DailyGoComicsCom {
        public PeanutsBegins() {
                super();
                mComicName = "peanuts-begins";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(1950, 9, 2);
        }
}
