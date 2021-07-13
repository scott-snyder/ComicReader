package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class TruthFacts extends DailyGoComicsCom {
        public TruthFacts() {
                super();
                mComicName = "truth-facts";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 5, 16);
        }
}
