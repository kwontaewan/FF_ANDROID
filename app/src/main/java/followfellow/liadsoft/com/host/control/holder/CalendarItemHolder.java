package followfellow.liadsoft.com.host.control.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import followfellow.liadsoft.com.R;


/**
 * Created by Gunter on 2016-01-27.
 */
public class CalendarItemHolder extends RecyclerView.ViewHolder {
    public TextView monthText;
    public TextView monthText2;
    public ImageView profileImg;
    public TextView dateText;
    public TextView personnelText;
    public Context context;
    public CalendarItemHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();
        monthText = (TextView)itemView.findViewById(R.id.h_cal_month_text);
        monthText2 = (TextView)itemView.findViewById(R.id.h_cal_month_text2);
        profileImg = (ImageView)itemView.findViewById(R.id.h_cal_profile_img);
        dateText = (TextView)itemView.findViewById(R.id.h_cal_date_text);
        personnelText = (TextView)itemView.findViewById(R.id.h_cal_personnel_text);
    }
}
