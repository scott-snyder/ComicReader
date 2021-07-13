package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class AskaCat extends DailyGoComicsCom {
        public AskaCat() {
                super();
                mComicName = "ask-a-cat";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2015, 5, 22);
        }
}
