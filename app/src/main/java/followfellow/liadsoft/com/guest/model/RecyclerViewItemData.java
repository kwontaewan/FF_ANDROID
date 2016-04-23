package followfellow.liadsoft.com.guest.model;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-07.
 */
public class RecyclerViewItemData {
    //HOME화면에 리사이클러뷰 list사진들을 뿌려주는 함수
    public static ArrayList<Integer> getAllHomeItemList(){
        ArrayList<Integer> allItems = new ArrayList<>();
        allItems.add(R.drawable.testpic);
        allItems.add(R.drawable.testpic2);
        allItems.add(R.drawable.testpic3);
        return allItems;
    }

    public static ArrayList<Integer> getAllListItemList(){
        ArrayList<Integer> allItems = new ArrayList<>();
        allItems.add(R.drawable.testlist);
        allItems.add(R.drawable.testlist);
        allItems.add(R.drawable.testlist);
        return allItems;
    }
}
