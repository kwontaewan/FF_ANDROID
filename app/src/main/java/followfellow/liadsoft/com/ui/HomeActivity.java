package followfellow.liadsoft.com.ui;

import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.data.TabData;


public class HomeActivity extends ActionBarActivity {

    //View Pager Variables
    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;

    //Tab Layout Variables
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Tab Layouta
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);

        //Add Tab Icon
        for(Drawable tabImage : TabData.getDrawableAll(getBaseContext()))
        {
            mTabLayout.addTab(mTabLayout.newTab().setIcon(tabImage));
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
