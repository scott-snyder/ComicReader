package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class NickandZuzu extends DailyGoComicsCom {
        public NickandZuzu() {
                super();
                mComicName = "nick-and-zuzu";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2013, 6, 1);
        }
}
