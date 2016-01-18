package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.viewpagerindicator.LinePageIndicator;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.DatePickerControl;
import followfellow.liadsoft.com.guest.control.adapter.TourBookingViewPagerAdapter;
import followfellow.liadsoft.com.guest.model.ViewPagerData;
import me.nlmartian.silkcal.DayPickerView;

/**
 * Created by Gunter on 2016-01-18.
 */
public class TourBookingActivity extends AppCompatActivity {
    private DayPickerView calenderView;
    private ViewPager viewPager;
    private TourBookingViewPagerAdapter tourBookingViewPagerAdapter;
    private LinePageIndicator linePageIndicator;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_booking);
        calenderView = (DayPickerView)findViewById(R.id.calendar_view);
        calenderView.setController(new DatePickerControl());
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
