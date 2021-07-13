package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class HutchOwen extends DailyGoComicsCom {
        public HutchOwen() {
                super();
                mComicName = "hutch-owen";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2013, 0, 28);
        }
}
