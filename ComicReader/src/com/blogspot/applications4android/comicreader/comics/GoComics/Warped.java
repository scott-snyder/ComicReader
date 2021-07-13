package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Warped extends DailyGoComicsCom {
        public Warped() {
                super();
                mComicName = "warped";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 8, 19);
        }
}
