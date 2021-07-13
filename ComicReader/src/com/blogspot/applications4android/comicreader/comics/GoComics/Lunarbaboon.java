package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Lunarbaboon extends DailyGoComicsCom {
        public Lunarbaboon() {
                super();
                mComicName = "lunarbaboon";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 9, 5);
        }
}
