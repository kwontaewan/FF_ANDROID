package followfellow.liadsoft.com.guest.control.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.holder.HomeItemHolder;

/**
 * Created by user on 2016-01-07.
 */
public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<HomeItemHolder> {
    private Context context;
    private ArrayList<Integer> itemList;

    public HomeRecyclerViewAdapter(Context context,ArrayList<Integer> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public HomeItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home,parent,false);
        return new HomeItemHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeItemHolder holder, int position) {
        holder.imageView.setImageResource(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return (itemList.size() >0)? itemList.size() : 0;
    }
}
