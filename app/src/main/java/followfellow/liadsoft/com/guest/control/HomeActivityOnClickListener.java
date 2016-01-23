package followfellow.liadsoft.com.guest.control;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.view.activity.HostHomeActivity;

/**
 * Created by Gunter on 2016-01-22.
 */
public class HomeActivityOnClickListener implements View.OnClickListener {
    private Context context;

    public HomeActivityOnClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
        case R.id.sw_host_mode :
            ((Activity)context).finish();
            Intent intent = new Intent(context, HostHomeActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
    }
}
}
