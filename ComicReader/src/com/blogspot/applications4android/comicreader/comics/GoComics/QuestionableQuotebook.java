package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class QuestionableQuotebook extends DailyGoComicsCom {
        public QuestionableQuotebook() {
                super();
                mComicName = "questionable-quotebook";
                mFirstCal = Calendar.getInstance();
                mFirstCal.set(2016, 1, 1);
        }
}
