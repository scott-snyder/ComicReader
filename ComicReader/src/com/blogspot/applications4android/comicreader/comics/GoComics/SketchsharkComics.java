package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class SketchsharkComics extends DailyGoComicsCom {
        public SketchsharkComics() {
                super();
                mComicName = "sketchshark-comics";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 7, 29);
        }
}
