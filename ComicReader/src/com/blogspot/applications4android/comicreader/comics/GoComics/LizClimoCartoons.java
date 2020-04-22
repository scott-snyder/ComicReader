package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class LizClimoCartoons extends DailyGoComicsCom {
        public LizClimoCartoons() {
                super();
                mComicName = "liz-climo-cartoons";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2018, 2, 26);
        }
}
