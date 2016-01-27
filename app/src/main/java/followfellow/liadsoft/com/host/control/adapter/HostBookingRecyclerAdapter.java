package followfellow.liadsoft.com.host.control.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.holder.BookingItemHolder;

/**
 * Created by user on 2016-01-25.
 */
public class HostBookingRecyclerAdapter extends RecyclerView.Adapter<BookingItemHolder> {
    private Context context;

    public HostBookingRecyclerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public BookingItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.h_item_booking,parent,false);
        return new BookingItemHolder(view);
    }

    @Override
    public void onBindViewHolder(BookingItemHolder holder, int position) {
        holder.imageView.setImageResource(R.drawable.add);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
