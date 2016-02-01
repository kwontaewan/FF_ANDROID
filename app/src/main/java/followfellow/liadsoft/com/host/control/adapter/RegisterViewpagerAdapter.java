package followfellow.liadsoft.com.host.control.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.viewpagerindicator.LinePageIndicator;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-30.
 */
public class RegisterViewpagerAdapter extends PagerAdapter {
    private Context context;
    private ArrayList<Bitmap> bitmaps;
    private LinePageIndicator linePageIndicator;
    public RegisterViewpagerAdapter(Context context, ArrayList<Bitmap> bitmaps,LinePageIndicator linePageIndicator) {
        this.context = context;
        this.bitmaps = bitmaps;
        this.linePageIndicator = linePageIndicator;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View page = inflater.inflate(R.layout.h_resgister_viewpager_item, null);
        ImageView imageView = (ImageView) page.findViewById(R.id.tour_img);
        ImageView imageView1 = (ImageView) page.findViewById(R.id.delete_img);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitmaps.remove(position);
                notifyDataSetChanged();
                linePageIndicator.notifyDataSetChanged();
            }
        });
        imageView.setImageBitmap(bitmaps.get(position));
        container.addView(page, 0);
        return page;

    }

    @Override
    public int getCount() {
        return (bitmaps.size() > 0) ? bitmaps.size() : 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (object == view);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}