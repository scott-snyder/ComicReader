package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class MrLowe extends DailyGoComicsCom {
        public MrLowe() {
                super();
                mComicName = "mr-lowe";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 4, 18);
        }
}
