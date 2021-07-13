package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class OurSuperAdventure extends DailyGoComicsCom {
        public OurSuperAdventure() {
                super();
                mComicName = "our-super-adventure";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2019, 6, 8);
        }
}
