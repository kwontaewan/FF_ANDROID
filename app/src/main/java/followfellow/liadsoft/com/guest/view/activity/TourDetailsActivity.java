package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
    @Bind(R.id.tour_details_viewpager) ViewPager pager;
    private TourDetailsViewPagerAdapter tourDetailsViewPagerAdapter;
    private CircleIndicator circleIndicator;
    private ImageView ratingListButton;
    private LinearLayout linearLayout;
    private RecyclerView.LayoutManager reviewLayoutManger;
    private RecyclerView reviewRecyclerView;
    private ReviewRecyclerViewAdapter reviewRecyclerViewAdapter;
    private ScrollView scrollView;
    private RatingBar ratingBar;
    private Button hostProfileButton;
    private Button bookNowButtom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourdetails);
        ButterKnife.bind(this);
        circleIndicator = (CircleIndicator) findViewById(R.id.pageIndicator);
        ratingListButton = (ImageView)findViewById(R.id.rating_list_all);
        linearLayout = (LinearLayout)findViewById(R.id.review_list);
        reviewRecyclerView = (RecyclerView)findViewById(R.id.review_recycler_view);
        scrollView = (ScrollView)findViewById(R.id.scrollView);
        ratingBar = (RatingBar)findViewById(R.id.rating_bar);
        hostProfileButton = (Button)findViewById(R.id.host_button);
        hostProfileButton.setOnClickListener(new TourDetailsOnclickListener(this));
        bookNowButtom = (Button)findViewById(R.id.book_now_button);
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
