package followfellow.liadsoft.com.guest.control;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import followfellow.liadsoft.com.R;


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
        if (tab.getPosition() == 0){
            tab.setIcon(R.drawable.gm_tab_home);
        }else if (tab.getPosition() == 1){
            tab.setIcon(R.drawable.gm_tab_list);
        }else if(tab.getPosition() == 2){
            tab.setIcon(R.drawable.gm_tab_message);
        }else if(tab.getPosition() == 3){
            tab.setIcon(R.drawable.gm_tab_history);
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        if(tab.getPosition() == 0){
            tab.setIcon(R.drawable.gm_un_tab_home);
        }else if (tab.getPosition() == 1){
            tab.setIcon(R.drawable.gm_un_tab_list);
        }else if(tab.getPosition() == 2){
            tab.setIcon(R.drawable.gm_un_tab_message);
        }else if(tab.getPosition() == 3){
            tab.setIcon(R.drawable.gm_un_tab_history);
        }
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
