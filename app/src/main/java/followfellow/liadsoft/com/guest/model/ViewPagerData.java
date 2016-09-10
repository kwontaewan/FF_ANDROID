package followfellow.liadsoft.com.guest.model;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-08.
 */
public class ViewPagerData {
    //Home화면 viewpager data
   public static ArrayList<Integer> getAllHomePagerItem(){
       ArrayList<Integer> allItems = new ArrayList<>();
       allItems.add(R.drawable.gm_11b_12);
       allItems.add(R.drawable.gm_11b_12);
       allItems.add(R.drawable.gm_11b_12);
       return allItems;
    }
    //투어상세화면 viewpager data
    public static ArrayList<Integer> getAllTourDetailsPagerItem(){
        ArrayList<Integer> allItems = new ArrayList<>();
        allItems.add(R.drawable.testpic);
        allItems.add(R.drawable.testpic2);
        allItems.add(R.drawable.testpic3);
        return allItems;
    }
}
