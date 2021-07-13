package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class EyebeamClassic extends DailyGoComicsCom {
        public EyebeamClassic() {
                super();
                mComicName = "eyebeam-classic";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(1978, 9, 5);
        }
}
