package followfellow.liadsoft.com.guest.control.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-14.
 */
public class TourDetailsViewPagerAdapter extends PagerAdapter {
    private Context context;
    ArrayList<Integer> pagerItems;

    public TourDetailsViewPagerAdapter(Context context,ArrayList<Integer> pagerItems) {
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
        View page = inflater.inflate(R.layout.tour_details_viewpager_item,null);
        ImageView imageView = (ImageView)page.findViewById(R.id.image);
        Picasso.with(context).load(pagerItems.get(position)).into(imageView);
        //imageView.setImageResource(pagerItems.get(position));
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
