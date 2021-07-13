package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class SunnyStreet extends DailyGoComicsCom {
        public SunnyStreet() {
                super();
                mComicName = "sunny-street";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2005, 1, 14);
        }
}
