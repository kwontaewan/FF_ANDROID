package followfellow.liadsoft.com.host.control.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.HostPendingRecyclerOnClickListener;
import followfellow.liadsoft.com.host.control.holder.PendingItemHolder;

/**
 * Created by user on 2016-01-23.
 */
public class HostPendingRecyclerViewAdapter extends RecyclerView.Adapter<PendingItemHolder> {
    private Context context;
    private ArrayList<Integer> itemList;

    public HostPendingRecyclerViewAdapter(Context context, ArrayList<Integer> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public PendingItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.h_item_pending,parent,false);
        return new PendingItemHolder(view);
    }

    @Override
    public void onBindViewHolder(PendingItemHolder holder, int position) {
        holder.imageView.setImageResource(itemList.get(position));
        holder.itemView.setOnClickListener(new HostPendingRecyclerOnClickListener(context));

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
