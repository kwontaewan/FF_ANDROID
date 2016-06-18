package followfellow.liadsoft.com.guest.control.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-12.
 */
public class ListItemHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.ListImg) public ImageView imageView;
    @Bind(R.id.mainText) public TextView mainTitle;
    @Bind(R.id.subText) public TextView subTitle;
    @Bind(R.id.star_count_text) public TextView startCountText;
    @Bind(R.id.review_count_text) public TextView reviewCountText;
    public ListItemHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
