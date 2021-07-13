package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class HotComicsforCoolPeople extends DailyGoComicsCom {
        public HotComicsforCoolPeople() {
                super();
                mComicName = "hot-comics-for-cool-people";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 11, 14);
        }
}
