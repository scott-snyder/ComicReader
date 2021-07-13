package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Harley extends DailyGoComicsCom {
        public Harley() {
                super();
                mComicName = "harley";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2017, 2, 6);
        }
}
