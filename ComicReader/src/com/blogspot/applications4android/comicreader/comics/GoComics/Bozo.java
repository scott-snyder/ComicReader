package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Bozo extends DailyGoComicsCom {
        public Bozo() {
                super();
                mComicName = "bozo";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(1951, 4, 14);
        }
}
