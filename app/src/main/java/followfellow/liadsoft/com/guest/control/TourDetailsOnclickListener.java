package followfellow.liadsoft.com.guest.control;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.view.activity.TourBookingActivity;

/**
 * Created by user on 2016-01-16.
 */
public class TourDetailsOnclickListener implements View.OnClickListener {
    private Context context;
    private LinearLayout reviewList;
    private ScrollView scrollView;
    boolean isCheck=true;

    public TourDetailsOnclickListener(Context context) {
        this.context = context;
    }

    public TourDetailsOnclickListener(LinearLayout reviewList, ScrollView scrollView) {
        this.reviewList = reviewList;
        this.scrollView = scrollView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rating_list_all:
                if(isCheck==true){
                    reviewList.setVisibility(View.VISIBLE);
                    scrollView.post(new Runnable() {
                        @Override
                        public void run() {
                            scrollView.fullScroll(View.FOCUS_DOWN);
                        }
                    });
                    isCheck=false;
                }else {
                    reviewList.setVisibility(View.GONE);
                    isCheck=true;
                }
                break;
            case R.id.host_button:
               /* Intent intent = new Intent(context, GuestProfileActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);*/
                break;
            case R.id.book_now_button:
                Intent tourBooking = new Intent(context, TourBookingActivity.class);
                tourBooking.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(tourBooking);
                break;

        }
    }
}
