package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class ShenComix extends DailyGoComicsCom {
        public ShenComix() {
                super();
                mComicName = "shen-comix";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2009, 11, 16);
        }
}
