package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class atTavicat extends DailyGoComicsCom {
        public atTavicat() {
                super();
                mComicName = "tavicat";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 6, 11);
        }
}
