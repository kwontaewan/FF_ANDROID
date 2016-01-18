package followfellow.liadsoft.com.guest.control;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-01-18.
 */
public class HostProfileOnclickListener implements View.OnClickListener {
    private Context context;

    public HostProfileOnclickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.host_cancel_action:
                ((Activity)context).finish();
                break;
        }
    }
}
