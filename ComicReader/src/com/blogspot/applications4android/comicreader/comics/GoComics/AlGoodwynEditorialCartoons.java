package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class AlGoodwynEditorialCartoons extends DailyGoComicsCom {
        public AlGoodwynEditorialCartoons() {
                super();
                mComicName = "algoodwyn";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2020, 9, 12);
        }
}
