package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class GManWebcomics extends DailyGoComicsCom {
        public GManWebcomics() {
                super();
                mComicName = "g-man-webcomics";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 6, 20);
        }
}
