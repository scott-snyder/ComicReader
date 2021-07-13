package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class Yaffle extends DailyGoComicsCom {
        public Yaffle() {
                super();
                mComicName = "yaffle";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2018, 3, 2);
        }
}
