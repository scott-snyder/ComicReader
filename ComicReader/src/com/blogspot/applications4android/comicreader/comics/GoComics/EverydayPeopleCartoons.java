package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class EverydayPeopleCartoons extends DailyGoComicsCom {
        public EverydayPeopleCartoons() {
                super();
                mComicName = "everyday-people-cartoons";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 8, 9);
        }
}
