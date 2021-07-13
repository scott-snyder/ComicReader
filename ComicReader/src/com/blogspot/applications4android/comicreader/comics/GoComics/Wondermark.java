package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Wondermark extends DailyGoComicsCom {
        public Wondermark() {
                super();
                mComicName = "wondermark";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 5, 27);
        }
}
