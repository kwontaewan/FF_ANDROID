package followfellow.liadsoft.com.guest.control;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import followfellow.liadsoft.com.R;


/**
 * Created by user on 2016-01-11.
 */
public class OnNavigationItemSelectedListener implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;

    public OnNavigationItemSelectedListener(DrawerLayout drawerLayout) {
        this.drawerLayout = drawerLayout;
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
                return true;
            case R.id.list_item_2:
                return true;
            default:
                return true;
        }
    }
}
