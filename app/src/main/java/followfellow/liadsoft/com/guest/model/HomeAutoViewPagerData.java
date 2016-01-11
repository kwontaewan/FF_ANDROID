package followfellow.liadsoft.com.guest.model;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-08.
 */
public class HomeAutoViewPagerData {
   public static ArrayList<Integer> getAllPagerItem(){
       ArrayList<Integer> allItems = new ArrayList<>();
       allItems.add(R.drawable.busking1);
       allItems.add(R.drawable.craft1);
       allItems.add(R.drawable.hanok1);
       return allItems;
    }
}
