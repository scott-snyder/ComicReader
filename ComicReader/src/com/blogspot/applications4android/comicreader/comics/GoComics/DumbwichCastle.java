package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class DumbwichCastle extends DailyGoComicsCom {
        public DumbwichCastle() {
                super();
                mComicName = "dumbwich-castle";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2017, 0, 30);
        }
}
