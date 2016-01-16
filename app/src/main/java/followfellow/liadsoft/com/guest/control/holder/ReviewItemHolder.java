package followfellow.liadsoft.com.guest.control.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.CircularImageView;

import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-01-16.
 */
public class ReviewItemHolder extends RecyclerView.ViewHolder {
    public CircularImageView reviewImg;
    public RatingBar ratingBar;
    public TextView reviewText;
    public TextView dateText;
    public Context context;
    public ReviewItemHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();
        reviewImg = (CircularImageView)itemView.findViewById(R.id.re_rating_img);
        ratingBar = (RatingBar)itemView.findViewById(R.id.re_rating_bar);
        reviewText = (TextView)itemView.findViewById(R.id.re_review_text);
        dateText = (TextView)itemView.findViewById(R.id.re_review_date);
    }
}
