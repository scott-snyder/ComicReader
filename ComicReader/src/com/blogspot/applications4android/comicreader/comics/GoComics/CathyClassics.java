package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class CathyClassics extends DailyGoComicsCom {
        public CathyClassics() {
                super();
                mComicName = "cathy";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(1976, 10, 22);
        }
}
