package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class OneandDone extends DailyGoComicsCom {
        public OneandDone() {
                super();
                mComicName = "1-and-done";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 7, 24);
        }
}
