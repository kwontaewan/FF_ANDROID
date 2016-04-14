package followfellow.liadsoft.com.guest.control.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-12.
 */
public class ListItemHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.ListImg)
    public ImageView imageView;
    public ListItemHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
