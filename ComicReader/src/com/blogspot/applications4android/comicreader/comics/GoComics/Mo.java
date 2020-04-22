package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Mo extends DailyGoComicsCom {
        public Mo() {
                super();
                mComicName = "mo";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2018, 4, 21);
        }
}
