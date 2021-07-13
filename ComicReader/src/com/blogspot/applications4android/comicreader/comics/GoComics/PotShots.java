package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class PotShots extends DailyGoComicsCom {
        public PotShots() {
                super();
                mComicName = "pot-shots";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 4, 11);
        }
}
