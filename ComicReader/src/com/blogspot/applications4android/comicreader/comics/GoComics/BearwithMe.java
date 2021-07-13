package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BearwithMe extends DailyGoComicsCom {
        public BearwithMe() {
                super();
                mComicName = "bear-with-me";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2009, 0, 19);
        }
}
