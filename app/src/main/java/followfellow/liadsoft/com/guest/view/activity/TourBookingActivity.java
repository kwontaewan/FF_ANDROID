package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.TourBookingViewPagerAdapter;
import followfellow.liadsoft.com.guest.model.ViewPagerData;

/**
 * Created by Gunter on 2016-01-18.
 */
public class TourBookingActivity extends AppCompatActivity {
    @Bind(R.id.tour_booking_viewpager) ViewPager viewPager;
    //@Bind(R.id.pageIndicator) CircleIndicator linePageIndicator;
    @Bind(R.id.selectDate) Button selectDateButton;
    @Bind(R.id.sendMessage) Button sendMessageButton;
    private TourBookingViewPagerAdapter tourBookingViewPagerAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_booking);
        ButterKnife.bind(this);
        initPager();
    }
    private void initPager(){
        tourBookingViewPagerAdapter = new TourBookingViewPagerAdapter(this, ViewPagerData.getAllTourDetailsPagerItem());
        viewPager.setAdapter(tourBookingViewPagerAdapter);
       // linePageIndicator.setViewPager(viewPager);
    }

}
