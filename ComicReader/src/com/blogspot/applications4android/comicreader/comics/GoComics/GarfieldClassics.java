package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class GarfieldClassics extends DailyGoComicsCom {
        public GarfieldClassics() {
                super();
                mComicName = "garfield-classics";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 5, 20);
        }
}
