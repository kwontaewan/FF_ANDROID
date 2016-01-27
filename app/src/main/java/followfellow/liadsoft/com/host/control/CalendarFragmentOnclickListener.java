package followfellow.liadsoft.com.host.control;

import android.view.View;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-01-27.
 */
public class CalendarFragmentOnclickListener implements View.OnClickListener {
    private CompactCalendarView compactCalendarView;

    public CalendarFragmentOnclickListener(CompactCalendarView compactCalendarView) {
        this.compactCalendarView = compactCalendarView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.h_calender_back:
                compactCalendarView.showPreviousMonth();
                break;
            case R.id.h_calender_forward:
                compactCalendarView.showNextMonth();
                break;
        }
    }
}
