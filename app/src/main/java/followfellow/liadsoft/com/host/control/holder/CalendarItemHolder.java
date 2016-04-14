package followfellow.liadsoft.com.host.control.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;


/**
 * Created by Gunter on 2016-01-27.
 */
public class CalendarItemHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.h_cal_month_text) public TextView monthText;
    @Bind(R.id.h_cal_month_text2) public TextView monthText2;
    @Bind(R.id.h_cal_profile_img) public ImageView profileImg;
    @Bind(R.id.h_cal_date_text) public TextView dateText;
    @Bind(R.id.h_cal_personnel_text) public TextView personnelText;
    public CalendarItemHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
