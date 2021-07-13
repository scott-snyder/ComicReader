package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class LooksGoodonPaper extends DailyGoComicsCom {
        public LooksGoodonPaper() {
                super();
                mComicName = "looks-good-on-paper";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 3, 13);
        }
}
