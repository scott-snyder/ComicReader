package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class MessycowComics extends DailyGoComicsCom {
        public MessycowComics() {
                super();
                mComicName = "messy-cow";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2018, 5, 4);
        }
}
