package followfellow.liadsoft.com.host.control.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-01-25.
 */
public class BookingItemHolder extends RecyclerView.ViewHolder {
    public Context context;
    public ImageView imageView;
    public BookingItemHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();
        imageView = (ImageView)itemView.findViewById(R.id.booking_circle_img);

    }
}
