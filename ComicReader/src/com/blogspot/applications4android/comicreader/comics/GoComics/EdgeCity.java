package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class EdgeCity extends DailyGoComicsCom {
        public EdgeCity() {
                super();
                mComicName = "edge-city";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 4, 2);
        }
}
