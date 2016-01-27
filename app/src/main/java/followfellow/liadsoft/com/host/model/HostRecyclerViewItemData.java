package followfellow.liadsoft.com.host.model;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-01-23.
 */
public class HostRecyclerViewItemData {
    //HOME화면에 리사이클러뷰 list사진들을 뿌려주는 함수
    public static ArrayList<Integer> getAllPedingItemList(){
        ArrayList<Integer> allItems = new ArrayList<>();
        allItems.add(R.drawable.testlist);
        allItems.add(R.drawable.testlist);
        allItems.add(R.drawable.testlist);
        return allItems;
    }
}
