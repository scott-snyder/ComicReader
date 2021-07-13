package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class GnomeSyndicate extends DailyGoComicsCom {
        public GnomeSyndicate() {
                super();
                mComicName = "gnome-syndicate";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 4, 23);
        }
}
