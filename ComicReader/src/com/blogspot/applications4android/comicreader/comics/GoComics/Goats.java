package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Goats extends DailyGoComicsCom {
        public Goats() {
                super();
                mComicName = "goats";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 8, 24);
        }
}
