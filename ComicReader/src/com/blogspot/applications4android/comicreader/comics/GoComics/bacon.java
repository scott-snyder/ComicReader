package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class bacon extends DailyGoComicsCom {
        public bacon() {
                super();
                mComicName = "bacon";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 6, 17);
        }
}
