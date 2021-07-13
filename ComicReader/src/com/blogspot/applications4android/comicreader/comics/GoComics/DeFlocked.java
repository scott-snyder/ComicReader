package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class DeFlocked extends DailyGoComicsCom {
        public DeFlocked() {
                super();
                mComicName = "deflocked";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2008, 4, 5);
        }
}
