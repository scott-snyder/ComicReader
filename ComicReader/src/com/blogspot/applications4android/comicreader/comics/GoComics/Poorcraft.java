package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Poorcraft extends DailyGoComicsCom {
        public Poorcraft() {
                super();
                mComicName = "poorcraft";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 8, 12);
        }
}
