package followfellow.liadsoft.com.host.control.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.holder.CalendarItemHolder;

/**
 * Created by Gunter on 2016-01-27.
 */
public class HostCalendarRecyclerAdapter extends RecyclerView.Adapter<CalendarItemHolder> {
    private Context context;

    public HostCalendarRecyclerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public CalendarItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.h_item_calendar,parent,false);
        return new CalendarItemHolder(view);
    }

    @Override
    public void onBindViewHolder(CalendarItemHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
