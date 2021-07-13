package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class GreenHumour extends DailyGoComicsCom {
        public GreenHumour() {
                super();
                mComicName = "green-humour";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2013, 11, 2);
        }
}
