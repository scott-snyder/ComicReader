package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class SmallPotatoes extends DailyGoComicsCom {
        public SmallPotatoes() {
                super();
                mComicName = "small-potatoes";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 9, 3);
        }
}
