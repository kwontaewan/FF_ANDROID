package followfellow.liadsoft.com.guest.view.activity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-04-02.
 */
public class GuestSettingActivity extends PreferenceActivity implements Preference.OnPreferenceClickListener {
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.guest_setting);
        getLayoutInflater().inflate(R.layout.toolbar, (ViewGroup)findViewById(android.R.id.content));
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setActionBar(toolbar);
        toolbar.setTitle("Setting");
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Preference alert = findPreference("alert");
        alert.setOnPreferenceClickListener(this);


        }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        if(preference.getKey().equals("alert")){
            Intent intent = new Intent(GuestSettingActivity.this,AlertSettingActivity.class);
            startActivity(intent);
        }
        return false;
    }
}
