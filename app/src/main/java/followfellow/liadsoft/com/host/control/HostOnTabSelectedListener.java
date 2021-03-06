package followfellow.liadsoft.com.host.control;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;


/**
 * Created by Fwang on 15. 11. 5..
 */
public class HostOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
    private ViewPager viewPager;
    public  HostOnTabSelectedListener(ViewPager viewPager)
    {
        this.viewPager = viewPager;
    }
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
