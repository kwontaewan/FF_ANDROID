package followfellow.liadsoft.com.host.control.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-23.
 */
public class PendingItemHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.h_pendingListImg) public ImageView imageView;
    public PendingItemHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
