package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class WaynoVision extends DailyGoComicsCom {
        public WaynoVision() {
                super();
                mComicName = "waynovision";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 11, 1);
        }
}
