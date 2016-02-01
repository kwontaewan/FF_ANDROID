package followfellow.liadsoft.com.host.control;

import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-01-30.
 */
public class HostRegisterPagerOnclickListener implements View.OnClickListener {
    private ArrayList<Bitmap> bitmaps;
    private PagerAdapter pagerAdapter;
    private int position;
    public HostRegisterPagerOnclickListener(ArrayList<Bitmap> bitmaps, PagerAdapter pagerAdapter, int position) {
        this.bitmaps = bitmaps;
        this.pagerAdapter = pagerAdapter;
        this.position = position;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tour_img:
                bitmaps.remove(position);
                pagerAdapter.notifyDataSetChanged();
                break;
        }
    }
}
