package followfellow.liadsoft.com.host.control.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-23.
 */
public class PendingItemHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public Context context;
    public PendingItemHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();
        imageView = (ImageView)itemView.findViewById(R.id.h_pendingListImg);
    }
}
