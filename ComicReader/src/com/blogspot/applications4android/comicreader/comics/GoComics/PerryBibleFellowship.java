package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class PerryBibleFellowship extends DailyGoComicsCom {
        public PerryBibleFellowship() {
                super();
                mComicName = "perry-bible-fellowship";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 10, 7);
        }
}
