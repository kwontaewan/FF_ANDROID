package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.HostProfileOnclickListener;

/**
 * Created by Gunter on 2016-01-16.
 */
public class HostProfileActivity extends AppCompatActivity {
    private ImageView imageView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_profile);
        imageView = (ImageView)findViewById(R.id.host_cancel_action);
        imageView.setOnClickListener(new HostProfileOnclickListener(this));
    }
}
