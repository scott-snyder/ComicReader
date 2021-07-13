package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class JimBentonCartoons extends DailyGoComicsCom {
        public JimBentonCartoons() {
                super();
                mComicName = "jim-benton-cartoons";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 5, 12);
        }
}
