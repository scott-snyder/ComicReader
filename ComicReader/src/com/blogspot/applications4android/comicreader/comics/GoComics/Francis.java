package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Francis extends DailyGoComicsCom {
        public Francis() {
                super();
                mComicName = "francis";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 2, 30);
        }
}
