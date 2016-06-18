package followfellow.liadsoft.com.guest.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.BarDrawerToggle;
import followfellow.liadsoft.com.guest.control.OnNavigationItemSelectedListener;
import followfellow.liadsoft.com.guest.control.OnTabSelectedListener;
import followfellow.liadsoft.com.guest.control.adapter.ViewPagerAdapter;
import followfellow.liadsoft.com.guest.model.TabData;
import followfellow.liadsoft.com.host.view.activity.HostHomeActivity;


public class HomeActivity extends AppCompatActivity {

    //View Pager Variables
    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private ActionBarDrawerToggle drawerToggle;

    @Bind(R.id.tabLayout) TabLayout mTabLayout;
    @Bind(R.id.followfellow_toolbar) Toolbar toolbar;
    @Bind(R.id.drawer_layout) DrawerLayout drawerLayout;
    @Bind(R.id.navigation_view) NavigationView navigationView;
    @Bind(R.id.sw_host_mode) Button swHostMode;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //Setting toolbar as Actionbar.
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
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

        //Add Tab Icon/
        for(Integer tabImg : TabData.getDrawableAll())
        {
            mTabLayout.addTab(mTabLayout.newTab().setIcon(tabImg));
        }
        for (int i=1;i<4;i++){
            mTabLayout.getTabAt(i).setIcon(TabData.unTabgetDrawableAll().get(i));
            //mTabLayout.getTabAt(i).getIcon().setAlpha(127);
        }
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        //Fragment Adapter
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),getBaseContext());

        // Set View Pager
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(mViewPagerAdapter);
        // Set Listener
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setOnTabSelectedListener(new OnTabSelectedListener(mViewPager));
/*        mTabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager) {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                super.onTabSelected(tab);
                Log.d("TabLayout","1 : "+tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Log.d("TabLayout","2 : "+tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Log.d("TabLayout","3 : "+tab.getPosition());
            }
        });*/
    }
    @Nullable @OnClick(R.id.sw_host_mode)
    void swithcingMode(){
        finish();
        Intent intent = new Intent(this, HostHomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
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
