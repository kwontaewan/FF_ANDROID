package followfellow.liadsoft.com.guest.control.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.TourDetailsPagerOnclickListener;

/**
 * Created by Gunter on 2016-01-14.
 */
public class TourBookingViewPagerAdapter extends PagerAdapter {
    private Context context;
    ArrayList<Integer> pagerItems;

    public TourBookingViewPagerAdapter(Context context, ArrayList<Integer> pagerItems) {
        this.context = context;
        this.pagerItems = pagerItems;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View page = inflater.inflate(R.layout.tour_booking_viewpager_item,null);

        ImageView imageView = (ImageView)page.findViewById(R.id.image);
        ImageView imageView2 = (ImageView)page.findViewById(R.id.cancel_action);
        imageView2.setOnClickListener(new TourDetailsPagerOnclickListener(context));
        imageView.setImageResource(pagerItems.get(position));
        container.addView(page,0);
        return page;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (object==view);
    }
}
