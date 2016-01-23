package followfellow.liadsoft.com.host.control;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.view.HomeActivity;

/**
 * Created by user on 2016-01-22.
 */
public class HostHomeActivityOnClickListener implements View.OnClickListener {
    private Context context;

    public HostHomeActivityOnClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        ((Activity)context).finish();
        switch (v.getId()){
            case R.id.sw_guest_mode :
                ((Activity)context).finish();
                Intent intent = new Intent(context, HomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
        }
    }

}
