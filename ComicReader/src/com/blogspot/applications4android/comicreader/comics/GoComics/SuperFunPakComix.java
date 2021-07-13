package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class SuperFunPakComix extends DailyGoComicsCom {
        public SuperFunPakComix() {
                super();
                mComicName = "super-fun-pak-comix";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2014, 4, 12);
        }
}
