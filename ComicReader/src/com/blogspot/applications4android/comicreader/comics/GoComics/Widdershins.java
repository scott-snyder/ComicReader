package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Widdershins extends DailyGoComicsCom {
        public Widdershins() {
                super();
                mComicName = "widdershins";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 7, 8);
        }
}
