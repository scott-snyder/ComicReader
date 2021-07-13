package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class GlasbergenCartoons extends DailyGoComicsCom {
        public GlasbergenCartoons() {
                super();
                mComicName = "glasbergen-cartoons";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 6, 28);
        }
}
