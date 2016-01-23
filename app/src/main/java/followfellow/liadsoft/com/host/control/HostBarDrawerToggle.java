package followfellow.liadsoft.com.host.control;

import android.app.Activity;
import android.support.annotation.StringRes;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by Gunter on 2016-01-11.
 */
    //네이게이션바 토글 이벤트 클래스
public class HostBarDrawerToggle extends ActionBarDrawerToggle {
    public HostBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @StringRes int openDrawerContentDescRes, @StringRes int closeDrawerContentDescRes) {
        super(activity, drawerLayout, toolbar, openDrawerContentDescRes, closeDrawerContentDescRes);
    }
    //We can perform a particular action when the
    // Navigation View is opened by overriding the
    // onDrawerOpened() method.
    @Override
    public void onDrawerOpened(View drawerView) {
        super.onDrawerOpened(drawerView);
    }

    //We can perform a particular action when the
    // Navigation View is closed by overriding the
    // onDrawerClosed() method.
    @Override
    public void onDrawerClosed(View drawerView) {
        super.onDrawerClosed(drawerView);
    }
}
