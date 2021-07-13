package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class NextDoorNeighbors extends DailyGoComicsCom {
        public NextDoorNeighbors() {
                super();
                mComicName = "next-door-neighbors";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 5, 13);
        }
}
