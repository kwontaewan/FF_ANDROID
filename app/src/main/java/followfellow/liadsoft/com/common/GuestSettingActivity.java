package followfellow.liadsoft.com.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.GuestSettingListAdapter;

/**
 * Created by user on 2016-04-16.
 */
public class GuestSettingActivity extends AppCompatActivity {
    @Bind(R.id.guestSettingList) ListView listView;
    @Bind(R.id.guestSettingToolbar) Toolbar toolbar;
    private GuestSettingListAdapter guestSettingListAdapter;
    private Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guset_setting);
        ButterKnife.bind(this);
        initToolBar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        guestSettingListAdapter = new GuestSettingListAdapter(getApplicationContext());
        listView.setAdapter(guestSettingListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();
                        intent = new Intent(GuestSettingActivity.this,AlertSettingActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(),"4",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    void initToolBar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Setting");
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
    }
}
