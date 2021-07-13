package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class StoneSoupClassics extends DailyGoComicsCom {
        public StoneSoupClassics() {
                super();
                mComicName = "stone-soup-classics";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 9, 19);
        }
}
