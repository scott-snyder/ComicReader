package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class TheWanderingMelon extends DailyGoComicsCom {
        public TheWanderingMelon() {
                super();
                mComicName = "the-wandering-melon";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 5, 30);
        }
}
