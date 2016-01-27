package followfellow.liadsoft.com.host.control;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import followfellow.liadsoft.com.host.view.activity.HostBookingListActivity;

/**
 * Created by user on 2016-01-25.
 */
public class HostPendingRecyclerOnClickListener implements View.OnClickListener {
    private Context context;

    public HostPendingRecyclerOnClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        intent = new Intent(context, HostBookingListActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
