package followfellow.liadsoft.com.guest.control.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-07.
 */
//RecyclerView HomeListItems
public class HomeItemHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.homeListImg)
    public ImageView imageView;
    @Bind(R.id.mainTitle) public TextView mainTitle;
    @Bind(R.id.subTitle) public TextView subTitle;
    @Bind(R.id.tourCount) public TextView tourCountText;
    public HomeItemHolder(View itemView){
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
