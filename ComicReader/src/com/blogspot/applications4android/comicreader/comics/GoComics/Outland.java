package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Outland extends DailyGoComicsCom {
        public Outland() {
                super();
                mComicName = "outland";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(1989, 8, 3);
        }
}
