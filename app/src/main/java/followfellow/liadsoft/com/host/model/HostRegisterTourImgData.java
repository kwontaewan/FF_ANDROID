package followfellow.liadsoft.com.host.model;

import android.graphics.Bitmap;

import java.util.ArrayList;

/**
 * Created by user on 2016-01-27.
 */
public class HostRegisterTourImgData {
    public static ArrayList<Bitmap> bitmaps = new ArrayList<>();

    static public void setBitmaps(Bitmap bitmap){
        bitmaps.add(bitmap);
    }
    static public ArrayList<Bitmap> getBitmaps(){
        return bitmaps;
    }
}
