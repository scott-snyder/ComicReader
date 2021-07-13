package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Eyebeam extends DailyGoComicsCom {
        public Eyebeam() {
                super();
                mComicName = "eyebeam";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(1996, 0, 1);
        }
}
