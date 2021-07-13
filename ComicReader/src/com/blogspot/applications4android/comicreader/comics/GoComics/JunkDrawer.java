package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class JunkDrawer extends DailyGoComicsCom {
        public JunkDrawer() {
                super();
                mComicName = "junk-drawer";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2019, 8, 23);
        }
}
