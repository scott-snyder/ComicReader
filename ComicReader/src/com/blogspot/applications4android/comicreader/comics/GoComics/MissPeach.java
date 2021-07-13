package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class MissPeach extends DailyGoComicsCom {
        public MissPeach() {
                super();
                mComicName = "miss-peach";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2000, 0, 1);
        }
}
