package followfellow.liadsoft.com.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.GuestAlertSettingListAdapter;

/**
 * Created by user on 2016-04-16.
 */
public class AlertSettingActivity extends AppCompatActivity {
    @Bind(R.id.alertSettingToolbar) Toolbar toolbar;
    @Bind(R.id.alertSettingList) ListView listView;
    private GuestAlertSettingListAdapter guestAlertSettingListAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_setting);
        ButterKnife.bind(this);
        initToolbar();
        guestAlertSettingListAdapter = new GuestAlertSettingListAdapter(getApplicationContext());
        listView.setAdapter(guestAlertSettingListAdapter);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Alert");
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
    }
}
