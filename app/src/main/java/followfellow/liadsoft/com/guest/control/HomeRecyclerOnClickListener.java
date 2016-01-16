package followfellow.liadsoft.com.guest.control;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import followfellow.liadsoft.com.guest.view.activity.TourDetailsActivity;

/**
 * Created by user on 2016-01-14.
 */
public class HomeRecyclerOnClickListener implements View.OnClickListener {
    private Context context;

    public HomeRecyclerOnClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        intent = new Intent(context, TourDetailsActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

    }
}
