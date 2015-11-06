package followfellow.liadsoft.com.data;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.util.ImageUtil;

/**
 * Created by Fwang on 15. 11. 5..
 */
public class TabData {
    //Tab Name
    public static ArrayList<String> getStringAll(Context context)
    {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(context.getString(R.string.category1));
        arrayList.add(context.getString(R.string.category2));
        arrayList.add(context.getString(R.string.category3));
        arrayList.add(context.getString(R.string.category4));
        arrayList.add(context.getString(R.string.category5));
        return arrayList;
    }
    //Tab Icon
    public static ArrayList<Drawable> getDrawableAll(Context context)
    {
        ArrayList<Drawable> arrayList = new ArrayList();
        float x_size = context.getResources().getDimension(R.dimen.category_icon_size__x);
        float y_size = context.getResources().getDimension(R.dimen.category_icon_size_y);
        arrayList.add(ImageUtil.resToDrawable(context, R.drawable.tab_icon_main,x_size,y_size));
        arrayList.add(ImageUtil.resToDrawable(context, R.drawable.tab_icon_search,x_size,y_size));
        arrayList.add(ImageUtil.resToDrawable(context, R.drawable.tab_icon_message,x_size,y_size));
        arrayList.add(ImageUtil.resToDrawable(context, R.drawable.tab_icon_cart,x_size,y_size));
        arrayList.add(ImageUtil.resToDrawable(context, R.drawable.tab_icon_option,x_size,y_size));
        return arrayList;
    }
}
