package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class TodaysSzep extends DailyGoComicsCom {
        public TodaysSzep() {
                super();
                mComicName = "todays-szep";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2020, 7, 31);
        }
}
