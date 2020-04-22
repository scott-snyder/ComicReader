package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class OhBrother extends DailyGoComicsCom {
        public OhBrother() {
                super();
                mComicName = "oh-brother";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2012, 3, 16);
        }
}
