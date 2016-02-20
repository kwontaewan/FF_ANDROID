package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-02-20.
 */
public class InviteFriendActivity extends AppCompatActivity {
    private Toolbar toolbar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_friend);
        toolbar = (Toolbar)findViewById(R.id.h_invite_toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
    }
}
