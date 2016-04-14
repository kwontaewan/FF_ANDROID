package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.CircularImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-16.
 */
public class HostProfileActivity extends AppCompatActivity {
    @Bind(R.id.hostProfileToolbar) Toolbar toolbar;
    @Bind(R.id.profileImg) CircularImageView circularImageView;
    @Bind(R.id.hostProfileTextLayout) LinearLayout textLinearLayout;
    @Bind(R.id.hostNameText) TextView hostNameText;
    @Bind(R.id.hostLocationText) TextView hostLocationText;
    @Bind(R.id.interestText) TextView InterestText;
    @Bind(R.id.interestText2) TextView InterestText2;
    @Bind(R.id.interestText3) TextView InterestText3;
    @Bind(R.id.introduceTitle) TextView IntroduceTitleText;
    @Bind(R.id.introduceContent) TextView IntroduceContentText;
    @Bind(R.id.hostProfileEditLayout) LinearLayout editLinearLayout;
    @Bind(R.id.hostNameEdit) EditText hostNameEdit;
    @Bind(R.id.hostLocationEdit) EditText hostLocationEdit;
    @Bind(R.id.interestEdit) EditText InterestEdit;
    @Bind(R.id.interestEdit2) EditText InterestEdit2;
    @Bind(R.id.interestEdit3) EditText InterestEdit3;
    @Bind(R.id.introduceTitleEdit) EditText IntroduceTitleEdit;
    @Bind(R.id.introduceContentEdit) EditText IntroduceContentEdit;
    @Bind(R.id.editButton) Button editButton;
    @Bind(R.id.saveButton) Button saveButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_profile);
        ButterKnife.bind(this);
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
        toolbar.setTitle("Profile");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Nullable
    @OnClick(R.id.editButton)
    void setEditButton(){
        textLinearLayout.setVisibility(View.GONE);
        editLinearLayout.setVisibility(View.VISIBLE);
    }
    @Nullable @OnClick(R.id.saveButton)
    void setSaveButton(){
        textLinearLayout.setVisibility(View.VISIBLE);
        editLinearLayout.setVisibility(View.GONE);

    }

}
