package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class LostSheep extends DailyGoComicsCom {
        public LostSheep() {
                super();
                mComicName = "lostsheep";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2003, 6, 30);
        }
}
