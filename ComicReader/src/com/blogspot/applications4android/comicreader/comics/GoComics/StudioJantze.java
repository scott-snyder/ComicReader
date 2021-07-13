package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class StudioJantze extends DailyGoComicsCom {
        public StudioJantze() {
                super();
                mComicName = "studio-jantze";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2021, 0, 1);
        }
}
