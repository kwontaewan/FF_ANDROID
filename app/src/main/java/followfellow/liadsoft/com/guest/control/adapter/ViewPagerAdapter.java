package followfellow.liadsoft.com.guest.control.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.view.fragment.CartFragment;
import followfellow.liadsoft.com.guest.view.fragment.MainFragment;
import followfellow.liadsoft.com.guest.view.fragment.MessageFragment;
import followfellow.liadsoft.com.guest.view.fragment.OptionFragment;
import followfellow.liadsoft.com.guest.view.fragment.SearchFragment;


/**
 * Created by Fwang on 2015. 10. 31..
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public ViewPagerAdapter(android.support.v4.app.FragmentManager fm, Context context)
    {
        super(fm);
        this.context = context;
    }
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                Fragment mainFragment = new MainFragment();
                return mainFragment;
            case 1:
                Fragment searchFragment = new SearchFragment();
                return searchFragment;
            case 2:
                Fragment messageFragment = new MessageFragment();
                return messageFragment;
            case 3:
                Fragment cartFragment = new CartFragment();
                return cartFragment;
            case 4:
                Fragment optionFragment = new OptionFragment();
                return optionFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return context.getResources().getInteger(R.integer.fragment_number);
    }
}
