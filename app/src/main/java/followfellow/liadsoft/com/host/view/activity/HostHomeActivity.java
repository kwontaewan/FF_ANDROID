package followfellow.liadsoft.com.host.view.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.HostBarDrawerToggle;
import followfellow.liadsoft.com.host.control.HostHomeActivityOnClickListener;
import followfellow.liadsoft.com.host.control.HostOnNavigationItemSelectedListener;
import followfellow.liadsoft.com.host.control.HostOnTabSelectedListener;
import followfellow.liadsoft.com.host.control.adapter.HostHomeViewPagerAdapter;
import followfellow.liadsoft.com.host.model.HostTabData;
import followfellow.liadsoft.com.util.DoNotScrollViewPager;

/**
 * Created by Gunter on 2016-01-22.
 */
public class HostHomeActivity extends AppCompatActivity {
    //View Pager Variables
    @Bind(R.id.h_viewPager) DoNotScrollViewPager mViewPager;

    //Tab Layout Variables
    @Bind(R.id.h_tabLayout) TabLayout mTabLayout;

    //Toolbar Variables
    @Bind(R.id.h_followfellow_toolbar) Toolbar toolbar;
    @Bind(R.id.h_drawer_layout) DrawerLayout drawerLayout;
    @Bind(R.id.h_navigation_view) NavigationView navigationView;
    @Bind(R.id.sw_guest_mode) Button swGuestMode;

    private ActionBarDrawerToggle drawerToggle;
    private HostHomeViewPagerAdapter mViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_activity_main);
        ButterKnife.bind(this);
        swGuestMode.setOnClickListener(new HostHomeActivityOnClickListener(this));

        //Setting toolbar as Actionbar.
        setSupportActionBar(toolbar);

        //Setting OnNavigationItemSelectedListener to the Navigation View.
        //This is used to perform specific action when an item is clicked.
        navigationView.setNavigationItemSelectedListener(new HostOnNavigationItemSelectedListener(drawerLayout));

        //Initialising ActionBarDrawerToggle and overriding its methods
        drawerToggle = new HostBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);

        //Finally setting up the guest_drawer listener for DrawerLayout
        drawerLayout.setDrawerListener(drawerToggle);

        //Sync State of the navigation icon on the toolbar
        // with the guest_drawer when the guest_drawer is opened or closed.
        drawerToggle.syncState();

        //Add Tab Icon/
        for(String tabText : HostTabData.getStringAll(getBaseContext()))
        {
            mTabLayout.addTab(mTabLayout.newTab().setText(tabText));
        }
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Fragment Adapter
        mViewPagerAdapter = new HostHomeViewPagerAdapter(getSupportFragmentManager(),getBaseContext());

        mViewPager.setAdapter(mViewPagerAdapter);
        mViewPager.setPagingEnabled(false);

        // Set Listener
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setOnTabSelectedListener(new HostOnTabSelectedListener(mViewPager));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }

}
