package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class BFGFSyndrome extends DailyGoComicsCom {
        public BFGFSyndrome() {
                super();
                mComicName = "bfgf-syndrome";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2017, 6, 10);
        }
}
