package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class InvisibleBread extends DailyGoComicsCom {
        public InvisibleBread() {
                super();
                mComicName = "invisible-bread";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2013, 2, 11);
        }
}
