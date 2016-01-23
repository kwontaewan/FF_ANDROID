package followfellow.liadsoft.com.host.control.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.view.fragment.HostCalendarFragment;
import followfellow.liadsoft.com.host.view.fragment.HostMessageFragment;
import followfellow.liadsoft.com.host.view.fragment.HostPendingFragment;
import followfellow.liadsoft.com.host.view.fragment.HostRegisterFragment;


/**
 * Created by Fwang on 2015. 10. 31..
 */
public class HostHomeViewPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public HostHomeViewPagerAdapter(FragmentManager fm, Context context)
    {
        super(fm);
        this.context = context;
    }
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                Fragment pendingFragment = new HostPendingFragment();
                return pendingFragment;
            case 1:
                Fragment calendarFragment = new HostCalendarFragment();
                return calendarFragment;
            case 2:
                Fragment messageFragment = new HostMessageFragment();
                return messageFragment;
            case 3:
                Fragment registerFragment = new HostRegisterFragment();
                return registerFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return context.getResources().getInteger(R.integer.fragment_number);
    }
}
