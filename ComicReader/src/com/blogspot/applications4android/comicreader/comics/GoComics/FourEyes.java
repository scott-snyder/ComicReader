package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class FourEyes extends DailyGoComicsCom {
        public FourEyes() {
                super();
                mComicName = "four-eyes";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2003, 9, 14);
        }
}
