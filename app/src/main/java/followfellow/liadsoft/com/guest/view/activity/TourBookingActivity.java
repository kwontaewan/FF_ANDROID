package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.TourBookingViewPagerAdapter;
import followfellow.liadsoft.com.guest.model.ViewPagerData;
import me.relex.circleindicator.CircleIndicator;

/**
 * Created by Gunter on 2016-01-18.
 */
public class TourBookingActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TourBookingViewPagerAdapter tourBookingViewPagerAdapter;
    private CircleIndicator linePageIndicator;
   // private SimpleDateFormat df;
   // private TextView calendarText;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_booking);
        initPager();
    }
    private void initPager(){
        viewPager = (ViewPager)findViewById(R.id.tour_booking_viewpager);
        tourBookingViewPagerAdapter = new TourBookingViewPagerAdapter(this, ViewPagerData.getAllTourDetailsPagerItem());
        linePageIndicator = (CircleIndicator) findViewById(R.id.pageIndicator);
        viewPager.setAdapter(tourBookingViewPagerAdapter);
        linePageIndicator.setViewPager(viewPager);
    }

}
