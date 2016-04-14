package followfellow.liadsoft.com.host.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.viewpagerindicator.LinePageIndicator;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.custom.CategoryIconDialog;
import followfellow.liadsoft.com.host.control.HostRegisterOnclickListener;
import followfellow.liadsoft.com.host.control.adapter.RegisterViewpagerAdapter;
import followfellow.liadsoft.com.host.model.HostRegisterTourImgData;
import followfellow.liadsoft.com.util.ImageSelectHelper;

/**
 * Created by Gunter on 2016-01-30.
 */
public class HostRegisterActivity extends ImageSelectHelper {
    @Bind(R.id.h_register_toolbar) Toolbar toolbar;
    @Bind(R.id.tour_image_viewpager) ViewPager viewPager;
    @Bind(R.id.pageIndicator) LinePageIndicator linePageIndicator;
    @Bind(R.id.delete_all_img_button) Button deleteButton;
    @Bind(R.id.upload_img_button) Button uploadButton;
    @Bind(R.id.edit_button) Button editButton;
    @Bind(R.id.save_button) Button saveButton;
    @Bind(R.id.tour_main_title_text) TextView tourMainTitleText;
    @Bind(R.id.tour_sub_title_text) TextView tourSubTitleText;
    @Bind(R.id.tour_explanation_text) TextView tourExplanationText;
    @Bind(R.id.tour_main_title_edit) EditText tourMainTitleEdit;
    @Bind(R.id.tour_sub_title_edit) EditText tourSubTitleEdit;
    @Bind(R.id.tour_explanation_edit) EditText tourExplanationEdit;
    private RegisterViewpagerAdapter registerViewpagerAdapter;
    @Bind(R.id.tourLayout) LinearLayout tourLayout;
    @Bind(R.id.edit_tourLayout) LinearLayout editTourLayout;
    @Bind(R.id.tour_include_img1) ImageView tourIcon1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_activity_register);
        ButterKnife.bind(this);
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
        registerViewpagerAdapter = new RegisterViewpagerAdapter(this, HostRegisterTourImgData.getBitmaps(),linePageIndicator);
        uploadButton.setOnClickListener(new HostRegisterOnclickListener(this));
        deleteButton.setOnClickListener(new HostRegisterOnclickListener(this,registerViewpagerAdapter,linePageIndicator));
        initPager();
        editButton.setOnClickListener(new HostRegisterOnclickListener(editTourLayout,tourLayout));
        saveButton.setOnClickListener(new HostRegisterOnclickListener(tourMainTitleText,tourSubTitleText,tourExplanationText,tourMainTitleEdit,tourSubTitleEdit,tourExplanationEdit,tourLayout,editTourLayout));
        tourIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CategoryIconDialog categoryIconDialog = new CategoryIconDialog(HostRegisterActivity.this);
                categoryIconDialog.show();
            }
        });
    }



    private void initPager(){
        viewPager.setAdapter(registerViewpagerAdapter);
        linePageIndicator.setViewPager(viewPager);
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerViewpagerAdapter.notifyDataSetChanged();
    }
}
