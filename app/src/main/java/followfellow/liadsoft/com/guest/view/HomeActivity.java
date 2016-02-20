package followfellow.liadsoft.com.guest.view;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.BarDrawerToggle;
import followfellow.liadsoft.com.guest.control.HomeActivityOnClickListener;
import followfellow.liadsoft.com.guest.control.OnNavigationItemSelectedListener;
import followfellow.liadsoft.com.guest.control.OnTabSelectedListener;
import followfellow.liadsoft.com.guest.control.adapter.ViewPagerAdapter;
import followfellow.liadsoft.com.guest.model.TabData;
import followfellow.liadsoft.com.util.DoNotScrollViewPager;


public class HomeActivity extends AppCompatActivity {

    //View Pager Variables
    private DoNotScrollViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;

    //Tab Layout Variables
    private TabLayout mTabLayout;

    //Toolbar Variables
    private Toolbar toolbar;

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView navigationView;

    private Button swHostMode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swHostMode = (Button)findViewById(R.id.sw_host_mode);
        swHostMode.setOnClickListener(new HomeActivityOnClickListener(this));

        //Initialising toolBar
        toolbar = (Toolbar)findViewById(R.id.followfellow_toolbar);
        //Setting toolbar as Actionbar.
        setSupportActionBar(toolbar);
        //Initialising NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        //Initialising DrawerLayout.
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        //Setting OnNavigationItemSelectedListener to the Navigation View.
        //This is used to perform specific action when an item is clicked.
        navigationView.setNavigationItemSelectedListener(new OnNavigationItemSelectedListener(drawerLayout,this));

        //Initialising ActionBarDrawerToggle and overriding its methods
        drawerToggle = new BarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);

        //Finally setting up the guest_drawer listener for DrawerLayout
        drawerLayout.setDrawerListener(drawerToggle);

        //Sync State of the navigation icon on the toolbar
        // with the guest_drawer when the guest_drawer is opened or closed.
        drawerToggle.syncState();


        //Add Tab Layout
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);

        //Add Tab Icon/
        for(String tabText : TabData.getStringAll(getBaseContext()))
        {
            mTabLayout.addTab(mTabLayout.newTab().setText(tabText));
       }
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Fragment Adapter
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),getBaseContext());

        // Set View Pager
        mViewPager = (DoNotScrollViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(mViewPagerAdapter);
        mViewPager.setPagingEnabled(false);
        // Set Listener
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setOnTabSelectedListener(new OnTabSelectedListener(mViewPager));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
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
