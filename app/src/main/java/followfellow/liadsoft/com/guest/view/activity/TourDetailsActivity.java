package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.ScrollView;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.TourDetailsOnclickListener;
import followfellow.liadsoft.com.guest.control.adapter.ReviewRecyclerViewAdapter;
import followfellow.liadsoft.com.guest.control.adapter.TourDetailsViewPagerAdapter;
import followfellow.liadsoft.com.guest.model.ViewPagerData;
import me.relex.circleindicator.CircleIndicator;

/**
 * Created by Gunter on 2016-01-14.
 */
public class TourDetailsActivity extends AppCompatActivity {
    @Bind(R.id.toolbar) Toolbar toolbar;
    @Bind(R.id.tour_details_viewpager) ViewPager pager;
    @Bind(R.id.pageIndicator) CircleIndicator circleIndicator;
    @Bind(R.id.rating_list_all) ImageView ratingListButton;
    @Bind(R.id.review_list) LinearLayout linearLayout;
    @Bind(R.id.review_recycler_view) RecyclerView reviewRecyclerView;
    @Bind(R.id.scrollView) ScrollView scrollView;
    @Bind(R.id.rating_bar) RatingBar ratingBar;
    @Bind(R.id.host_button) Button hostProfileButton;
    @Bind(R.id.book_now_button) Button bookNowButtom;
    private TourDetailsViewPagerAdapter tourDetailsViewPagerAdapter;
    private RecyclerView.LayoutManager reviewLayoutManger;
    private ReviewRecyclerViewAdapter reviewRecyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourdetails);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tour");
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        hostProfileButton.setOnClickListener(new TourDetailsOnclickListener(this));
        bookNowButtom.setOnClickListener(new TourDetailsOnclickListener(this));
        ratingBar.setStepSize((float)0.5);
        ratingBar.setRating((float)0);
        ratingBar.setIsIndicator(false);
        ratingListButton.setOnClickListener(new TourDetailsOnclickListener(linearLayout,scrollView));
        initRecycleView();
        initViewPager();
    }

    private void initViewPager(){
        tourDetailsViewPagerAdapter = new TourDetailsViewPagerAdapter(this, ViewPagerData.getAllTourDetailsPagerItem());
        pager.setAdapter(tourDetailsViewPagerAdapter);
        circleIndicator.setViewPager(pager);
    }
    private void initRecycleView(){
        reviewLayoutManger = new LinearLayoutManager(getApplicationContext());
        reviewRecyclerView.setLayoutManager(reviewLayoutManger);
        reviewRecyclerViewAdapter = new ReviewRecyclerViewAdapter(getApplicationContext());
        reviewRecyclerView.setAdapter(reviewRecyclerViewAdapter);
    }

}
