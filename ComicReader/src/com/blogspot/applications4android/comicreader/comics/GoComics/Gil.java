package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Gil extends DailyGoComicsCom {
        public Gil() {
                super();
                mComicName = "gil";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 0, 4);
        }
}
