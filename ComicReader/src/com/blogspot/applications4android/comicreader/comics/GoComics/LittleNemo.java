package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class LittleNemo extends DailyGoComicsCom {
        public LittleNemo() {
                super();
                mComicName = "little-nemo";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 9, 15);
        }
}
