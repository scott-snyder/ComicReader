package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class TheWorriedWell extends DailyGoComicsCom {
        public TheWorriedWell() {
                super();
                mComicName = "the-worried-well";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 0, 4);
        }
}
