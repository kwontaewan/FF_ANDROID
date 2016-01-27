package followfellow.liadsoft.com.host.control;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/**
 * Created by user on 2016-01-25.
 */
public class HostBookingListNavigationOnClickListener implements View.OnClickListener {
    private Context context;

    public HostBookingListNavigationOnClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        ((Activity)context).finish();
    }
}
