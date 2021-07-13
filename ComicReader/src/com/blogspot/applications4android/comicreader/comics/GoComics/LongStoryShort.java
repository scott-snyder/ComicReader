package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class LongStoryShort extends DailyGoComicsCom {
        public LongStoryShort() {
                super();
                mComicName = "long-story-short";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2017, 10, 20);
        }
}
