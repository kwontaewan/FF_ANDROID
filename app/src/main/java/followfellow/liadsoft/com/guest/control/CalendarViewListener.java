package followfellow.liadsoft.com.guest.control;

import android.content.Context;
import android.widget.TextView;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 2016-01-21.
 */
public class CalendarViewListener implements CompactCalendarView.CompactCalendarViewListener {
    private Context context;
    private TextView textView;
    private SimpleDateFormat df;

    public CalendarViewListener(Context context) {
        this.context = context;
    }

    public CalendarViewListener(Context context, SimpleDateFormat df, TextView textView) {
        this.context = context;
        this.df = df;
        this.textView = textView;
    }

    @Override
    public void onDayClick(Date dateClicked) {

    }

    @Override
    public void onMonthScroll(Date firstDayOfNewMonth) {
        textView.setText(df.format(firstDayOfNewMonth));
    }
}
