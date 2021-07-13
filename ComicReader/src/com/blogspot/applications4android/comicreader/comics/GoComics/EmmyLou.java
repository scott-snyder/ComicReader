package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class EmmyLou extends DailyGoComicsCom {
        public EmmyLou() {
                super();
                mComicName = "emmy-lou";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2013, 1, 4);
        }
}
