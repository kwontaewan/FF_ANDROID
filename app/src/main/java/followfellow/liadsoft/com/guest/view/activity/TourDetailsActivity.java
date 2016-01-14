package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.viewpagerindicator.LinePageIndicator;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.TourDetailsViewPagerAdapter;
import followfellow.liadsoft.com.guest.model.ViewPagerData;

/**
 * Created by Gunter on 2016-01-14.
 */
public class TourDetailsActivity extends AppCompatActivity {
    private ViewPager pager;
    private TourDetailsViewPagerAdapter tourDetailsViewPagerAdapter;
    private LinePageIndicator linePageIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ativity_tourdetails);
        linePageIndicator = (LinePageIndicator)findViewById(R.id.pageIndicator);
        initViewPager();
    }

    private void initViewPager(){
        pager = (ViewPager)findViewById(R.id.tour_details_viewpager);
        tourDetailsViewPagerAdapter = new TourDetailsViewPagerAdapter(this, ViewPagerData.getAllTourDetailsPagerItem());
        pager.setAdapter(tourDetailsViewPagerAdapter);
        linePageIndicator.setViewPager(pager);

    }

}
