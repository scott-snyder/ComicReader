package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class MyDadisDracula extends DailyGoComicsCom {
        public MyDadisDracula() {
                super();
                mComicName = "my-dad-is-dracula";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2018, 3, 16);
        }
}
