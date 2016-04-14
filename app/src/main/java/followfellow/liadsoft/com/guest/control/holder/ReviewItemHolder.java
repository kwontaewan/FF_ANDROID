package followfellow.liadsoft.com.guest.control.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.CircularImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-01-16.
 */
public class ReviewItemHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.re_rating_img) public CircularImageView reviewImg;
    @Bind(R.id.re_rating_bar) public RatingBar ratingBar;
    @Bind(R.id.re_review_text) public TextView reviewText;
    @Bind(R.id.re_review_date) public TextView dateText;
    public ReviewItemHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
