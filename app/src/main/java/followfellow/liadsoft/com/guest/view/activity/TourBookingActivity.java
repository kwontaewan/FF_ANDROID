package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.viewpagerindicator.LinePageIndicator;

import java.text.SimpleDateFormat;
import java.util.Locale;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.CalendarViewListener;
import followfellow.liadsoft.com.guest.control.adapter.TourBookingViewPagerAdapter;
import followfellow.liadsoft.com.guest.model.ViewPagerData;

/**
 * Created by Gunter on 2016-01-18.
 */
public class TourBookingActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TourBookingViewPagerAdapter tourBookingViewPagerAdapter;
    private LinePageIndicator linePageIndicator;
    private SimpleDateFormat df;
    private TextView calendarText;
    private CompactCalendarView compactCalendarView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_booking);
        compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        df = new SimpleDateFormat("yyyy년MM월");
        calendarText = (TextView)findViewById(R.id.calender_text);
        compactCalendarView.drawSmallIndicatorForEvents(true);
        compactCalendarView.setLocale(Locale.KOREAN);
        compactCalendarView.setUseThreeLetterAbbreviation(true);
        compactCalendarView.setListener(new CalendarViewListener(this,df,calendarText));
        initPager();
    }
    private void initPager(){
        viewPager = (ViewPager)findViewById(R.id.tour_booking_viewpager);
        tourBookingViewPagerAdapter = new TourBookingViewPagerAdapter(this, ViewPagerData.getAllTourDetailsPagerItem());
        linePageIndicator = (LinePageIndicator)findViewById(R.id.pageIndicator);
        viewPager.setAdapter(tourBookingViewPagerAdapter);
        linePageIndicator.setViewPager(viewPager);
    }

}
