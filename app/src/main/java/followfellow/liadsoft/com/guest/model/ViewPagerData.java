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
       allItems.add(R.drawable.testpic);
       allItems.add(R.drawable.testpic);
       allItems.add(R.drawable.testpic);
       return allItems;
    }
    //투어상세화면 viewpager data
    public static ArrayList<Integer> getAllTourDetailsPagerItem(){
        ArrayList<Integer> allItems = new ArrayList<>();
        allItems.add(R.drawable.busking1);
        allItems.add(R.drawable.craft1);
        allItems.add(R.drawable.hanok1);
        return allItems;
    }
}
