package followfellow.liadsoft.com.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;

/**
 * Created by Fwang on 15. 11. 5..
 */
public class ImageUtil {
    public ImageUtil() {}
    public static Bitmap resToBitmap(Context context,int resid)
    {
        Bitmap icon = BitmapFactory.decodeResource(context.getResources(),resid);
        return icon;
    }
    public static Drawable resToDrawable(Context context,int resid)
    {
        Drawable icon = context.getResources().getDrawable(resid);
        return icon;
    }
    public static Drawable resToDrawable(Context context,int resid,float x,float y)
    {
        Drawable icon = context.getResources().getDrawable(resid);
        Bitmap bitmap = ((BitmapDrawable) icon).getBitmap();
        Log.e("fwang", "" + x + "  " + y);
        icon = new BitmapDrawable(context.getResources(),Bitmap.createScaledBitmap(bitmap,(int)x,(int)y, true));
        return icon;
    }
}
