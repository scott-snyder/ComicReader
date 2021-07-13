package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class KidBeowulf extends DailyGoComicsCom {
        public KidBeowulf() {
                super();
                mComicName = "kid-beowulf";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 6, 7);
        }
}
