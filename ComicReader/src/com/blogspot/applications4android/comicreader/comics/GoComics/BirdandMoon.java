package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BirdandMoon extends DailyGoComicsCom {
        public BirdandMoon() {
                super();
                mComicName = "bird-and-moon";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2018, 7, 13);
        }
}
