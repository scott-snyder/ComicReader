package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class SwanEaters extends DailyGoComicsCom {
        public SwanEaters() {
                super();
                mComicName = "swan-eaters";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2018, 9, 1);
        }
}
