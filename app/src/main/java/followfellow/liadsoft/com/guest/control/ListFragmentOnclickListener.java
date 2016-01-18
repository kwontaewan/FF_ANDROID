package followfellow.liadsoft.com.guest.control;

import android.view.View;
import android.widget.LinearLayout;

import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-01-13.
 */
public class ListFragmentOnclickListener implements View.OnClickListener {
    LinearLayout linearLayout;

    public ListFragmentOnclickListener(LinearLayout linearLayout) {
        this.linearLayout = linearLayout;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.filter_img_4:
                linearLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.search_button:
                linearLayout.setVisibility(View.GONE);
                break;
        }
    }
}
