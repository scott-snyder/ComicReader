package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class MexikidStories extends DailyGoComicsCom {
        public MexikidStories() {
                super();
                mComicName = "mexikid-stories";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2019, 8, 23);
        }
}
