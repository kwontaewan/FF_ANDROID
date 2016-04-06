package followfellow.liadsoft.com.guest.control.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.holder.ReviewItemHolder;

/**
 * Created by Gunter on 2016-01-16.
 */
public class ReviewRecyclerViewAdapter extends RecyclerView.Adapter<ReviewItemHolder> {
    private Context context;

    public ReviewRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ReviewItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_review,parent,false);
        return new ReviewItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewItemHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
