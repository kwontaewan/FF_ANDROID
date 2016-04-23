package followfellow.liadsoft.com.guest.control;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;


/**
 * Created by Fwang on 15. 11. 5..
 */
public class OnTabSelectedListener implements TabLayout.OnTabSelectedListener {
    private ViewPager viewPager;
    public OnTabSelectedListener(ViewPager viewPager)
    {
        this.viewPager = viewPager;
    }
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
        tab.getIcon().setAlpha(255);
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        tab.getIcon().setAlpha(127);
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
