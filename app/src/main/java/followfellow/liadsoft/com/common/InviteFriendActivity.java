package followfellow.liadsoft.com.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-02-20.
 */
public class InviteFriendActivity extends AppCompatActivity {
    @Bind(R.id.h_invite_toolbar) Toolbar toolbar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_friend);
        ButterKnife.bind(this);
        toolbar.setNavigationIcon(R.drawable.ic_action_back);

    }
}
