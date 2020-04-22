package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class PoorlyDrawnLines extends DailyGoComicsCom {
        public PoorlyDrawnLines() {
                super();
                mComicName = "poorly-drawn-lines";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2013, 8, 18);
        }
}
