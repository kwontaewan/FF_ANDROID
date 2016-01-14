package followfellow.liadsoft.com.guest.control;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/**
 * Created by user on 2016-01-14.
 */
public class TourDetailsPagerOnclickListener implements View.OnClickListener {
    private Context context;

    public TourDetailsPagerOnclickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        ((Activity)context).finish();
    }
}
