package followfellow.liadsoft.com.guest.control.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.holder.ListItemHolder;

/**
 * Created by Gunter on 2016-01-12.
 */
public class ListRecyclerViewAdapter extends RecyclerView.Adapter<ListItemHolder> {
    private Context context;
    private ArrayList<Integer> itemList;
    public ListRecyclerViewAdapter(Context context,ArrayList<Integer> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public ListItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ListItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ListItemHolder holder, int position) {
        holder.imageView.setImageResource(itemList.get(position));
        holder.mainTitle.setTypeface(Typeface.createFromAsset(context.getAssets(),"ArcaMajora_Heavy.otf"));
        holder.subTitle.setTypeface(Typeface.createFromAsset(context.getAssets(),"MyriadPro_Light.otf"));
        holder.startCountText.setTypeface(Typeface.createFromAsset(context.getAssets(),"MyriadPro-Regular.otf"));
        holder.reviewCountText.setTypeface(Typeface.createFromAsset(context.getAssets(),"MyriadPro-Regular.otf"));
    }

    @Override
    public int getItemCount() {
        return (itemList.size() >0)? itemList.size() : 0;
    }
}
