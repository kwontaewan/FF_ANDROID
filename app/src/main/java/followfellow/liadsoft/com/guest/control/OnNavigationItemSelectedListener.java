package followfellow.liadsoft.com.guest.control;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.widget.Toast;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.common.GuestProfileActivity;
import followfellow.liadsoft.com.common.GuestSettingActivity;
import followfellow.liadsoft.com.common.InviteFriendActivity;


/**
 * Created by Gunter on 2016-01-11.
 */
//네이비게이션바 아이템리스트 이벤트처리 클래스
public class OnNavigationItemSelectedListener implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    Context context;
    Intent intent;
    public OnNavigationItemSelectedListener(DrawerLayout drawerLayout, Context context) {
        this.drawerLayout = drawerLayout;
        this.context = context;
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        //Navigation View must close when any of this item is clicked.
        //To do this we use the closeDrawers() method.
        drawerLayout.closeDrawers();

        //Using switch case to identify the ID of the menu item
        // and then performing relevant action.
        switch (menuItem.getItemId()) {
            case R.id.list_item_1:
                intent  = new Intent(context, GuestProfileActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
                return true;
            case R.id.list_item_2:
                Toast.makeText(context,"AAA",Toast.LENGTH_SHORT).show();
                intent  = new Intent(context, GuestSettingActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
                return true;
            case R.id.list_item_3:
                intent = new Intent(context, InviteFriendActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            default:
                return true;
        }
    }
}
