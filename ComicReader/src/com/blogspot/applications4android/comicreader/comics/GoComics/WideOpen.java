package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class WideOpen extends DailyGoComicsCom {
        public WideOpen() {
                super();
                mComicName = "wide-open";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2010, 6, 17);
        }
}
