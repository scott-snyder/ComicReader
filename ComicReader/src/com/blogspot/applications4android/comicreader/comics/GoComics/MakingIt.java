package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class MakingIt extends DailyGoComicsCom {
        public MakingIt() {
                super();
                mComicName = "making-it";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2013, 5, 3);
        }
}
