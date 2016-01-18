package followfellow.liadsoft.com.guest.control;

import me.nlmartian.silkcal.DatePickerController;
import me.nlmartian.silkcal.SimpleMonthAdapter;

/**
 * Created by user on 2016-01-18.
 */
public class DatePickerControl implements DatePickerController{
    @Override
    public int getMaxYear() {
        return 0;
    }

    @Override
    public void onDayOfMonthSelected(int year, int month, int day) {

    }

    @Override
    public void onDateRangeSelected(SimpleMonthAdapter.SelectedDays<SimpleMonthAdapter.CalendarDay> selectedDays) {

    }
}
