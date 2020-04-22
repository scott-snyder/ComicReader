package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class LugNuts extends DailyGoComicsCom {
        public LugNuts() {
                super();
                mComicName = "lug-nuts";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 8, 1);
        }
}
