package followfellow.liadsoft.com.host.model;

import android.content.Context;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

/**
 * Created by Fwang on 15. 11. 5..
 */
public class HostTabData {
    //Tab Name
    public static ArrayList<String> getStringAll(Context context)
    {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(context.getString(R.string.h_category1));
        arrayList.add(context.getString(R.string.h_category2));
        arrayList.add(context.getString(R.string.h_category3));
        arrayList.add(context.getString(R.string.h_category4));
        return arrayList;
    }
    //Tab Icon
/*    public static ArrayList<Drawable> getDrawableAll(Context context)
    {
        ArrayList<Drawable> arrayList = new ArrayList();
        float x_size = context.getResources().getDimension(R.dimen.category_icon_size__x);
        float y_size = context.getResources().getDimension(R.dimen.category_icon_size_y);
        arrayList.add(ImageUtil.resToDrawable(context, R.drawable.tab_icon_main,x_size,y_size));
        arrayList.add(ImageUtil.resToDrawable(context, R.drawable.tab_icon_search,x_size,y_size));
        arrayList.add(ImageUtil.resToDrawable(context, R.drawable.tab_icon_message,x_size,y_size));
        arrayList.add(ImageUtil.resToDrawable(context, R.drawable.tab_icon_cart,x_size,y_size));
        return arrayList;
    }*/
}
