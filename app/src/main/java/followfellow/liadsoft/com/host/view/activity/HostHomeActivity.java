package followfellow.liadsoft.com.host.view.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.HostBarDrawerToggle;
import followfellow.liadsoft.com.host.control.HostHomeActivityOnClickListener;
import followfellow.liadsoft.com.host.control.HostOnNavigationItemSelectedListener;
import followfellow.liadsoft.com.host.control.HostOnTabSelectedListener;
import followfellow.liadsoft.com.host.control.adapter.HostHomeViewPagerAdapter;
import followfellow.liadsoft.com.host.model.HostTabData;

/**
 * Created by Gunter on 2016-01-22.
 */
public class HostHomeActivity extends AppCompatActivity {
    //View Pager Variables
    private ViewPager mViewPager;
    private HostHomeViewPagerAdapter mViewPagerAdapter;

    //Tab Layout Variables
    private TabLayout mTabLayout;

    //Toolbar Variables
    private Toolbar toolbar;

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView navigationView;

    private Button swGuestMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_activity_main);
        swGuestMode = (Button)findViewById(R.id.sw_guest_mode);
        swGuestMode.setOnClickListener(new HostHomeActivityOnClickListener(this));

        //Initialising toolBar
        toolbar = (Toolbar)findViewById(R.id.h_followfellow_toolbar);
        //Setting toolbar as Actionbar.
        setSupportActionBar(toolbar);
        //Initialising NavigationView
        navigationView = (NavigationView) findViewById(R.id.h_navigation_view);
        //Initialising DrawerLayout.
        drawerLayout = (DrawerLayout) findViewById(R.id.h_drawer_layout);
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


        //Add Tab Layout
        mTabLayout = (TabLayout) findViewById(R.id.h_tabLayout);

        //Add Tab Icon/
        for(String tabText : HostTabData.getStringAll(getBaseContext()))
        {
            mTabLayout.addTab(mTabLayout.newTab().setText(tabText));
        }
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Fragment Adapter
        mViewPagerAdapter = new HostHomeViewPagerAdapter(getSupportFragmentManager(),getBaseContext());

        // Set View Pager
        mViewPager = (ViewPager) findViewById(R.id.h_viewPager);
        mViewPager.setAdapter(mViewPagerAdapter);

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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
