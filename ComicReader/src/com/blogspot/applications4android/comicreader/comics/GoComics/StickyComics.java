package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class StickyComics extends DailyGoComicsCom {
        public StickyComics() {
                super();
                mComicName = "sticky-comics";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 2, 14);
        }
}
