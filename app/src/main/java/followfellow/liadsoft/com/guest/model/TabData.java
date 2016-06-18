package followfellow.liadsoft.com.guest.model;

import android.content.Context;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

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
        return arrayList;
    }
    //Tab Icon
    public static ArrayList<Integer> getDrawableAll()
    {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(R.drawable.gm_tab_home);
        arrayList.add(R.drawable.gm_tab_list);
        arrayList.add(R.drawable.gm_tab_message);
        arrayList.add(R.drawable.gm_tab_history);
        return arrayList;
    }
    public static ArrayList<Integer> unTabgetDrawableAll()
    {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(R.drawable.gm_un_tab_home);
        arrayList.add(R.drawable.gm_un_tab_list);
        arrayList.add(R.drawable.gm_un_tab_message);
        arrayList.add(R.drawable.gm_un_tab_history);
        return arrayList;
    }
}
