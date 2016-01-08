package followfellow.liadsoft.com.guest.model;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-07.
 */
public class HomeRecyclerViewItemData {
    //HOME화면에 리사이클러뷰 list사진들을 뿌려주는 함수
    public static ArrayList<Integer> getAllHomeItemList(){
        ArrayList<Integer> allItems = new ArrayList<>();
        allItems.add(R.drawable.tab_icon_main);
        allItems.add(R.drawable.tab_icon_main);
        allItems.add(R.drawable.tab_icon_main);
        return allItems;
    }
}
