package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class PirateMike extends DailyGoComicsCom {
        public PirateMike() {
                super();
                mComicName = "pirate-mike";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2018, 9, 15);
        }
}
