package followfellow.liadsoft.com.guest.control.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-01-07.
 */
public class HomeItemHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    private final Context context;
    public HomeItemHolder(View itemView){
        super(itemView);
        context = itemView.getContext();
        imageView = (ImageView)itemView.findViewById(R.id.homeListImg);
    }
}