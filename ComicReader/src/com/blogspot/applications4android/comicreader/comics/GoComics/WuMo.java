package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class WuMo extends DailyGoComicsCom {
        public WuMo() {
                super();
                mComicName = "wumo";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2013, 9, 13);
        }
}
