package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Snowflakes extends DailyGoComicsCom {
        public Snowflakes() {
                super();
                mComicName = "snowflakes";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 6, 6);
        }
}
