package followfellow.liadsoft.com.host.control.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-01-25.
 */
public class BookingItemHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.booking_circle_img) public ImageView imageView;
    public BookingItemHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
