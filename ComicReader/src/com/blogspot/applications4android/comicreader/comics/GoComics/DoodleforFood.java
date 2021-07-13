package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class DoodleforFood extends DailyGoComicsCom {
        public DoodleforFood() {
                super();
                mComicName = "doodle-for-food";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 10, 21);
        }
}
