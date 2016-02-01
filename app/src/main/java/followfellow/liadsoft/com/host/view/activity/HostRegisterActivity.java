package followfellow.liadsoft.com.host.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.viewpagerindicator.LinePageIndicator;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.HostRegisterOnclickListener;
import followfellow.liadsoft.com.host.control.adapter.RegisterViewpagerAdapter;
import followfellow.liadsoft.com.host.model.HostRegisterTourImgData;
import followfellow.liadsoft.com.host.model.HostRegisterTourTextData;
import followfellow.liadsoft.com.util.ImageSelectHelper;

/**
 * Created by Gunter on 2016-01-30.
 */
public class HostRegisterActivity extends ImageSelectHelper {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private LinePageIndicator linePageIndicator;
    private Button deleteButton;
    private Button uploadButton;
    private Button editButton;
    private Button saveButton;
    private TextView tourMainTitleText;
    private TextView tourSubTitleText;
    private TextView tourExplanationText;
    private EditText tourMainTitleEdit;
    private EditText tourSubTitleEdit;
    private EditText tourExplanationEdit;
    private RegisterViewpagerAdapter registerViewpagerAdapter;
    private LinearLayout tourLayout;
    private LinearLayout editTourLayout;
    private HostRegisterTourTextData hostRegisterTourTextData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_activity_register);
        hostRegisterTourTextData = new HostRegisterTourTextData();
        toolbar = (Toolbar)findViewById(R.id.h_register_toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
        deleteButton = (Button)findViewById(R.id.delete_all_img_button);
        uploadButton = (Button)findViewById(R.id.upload_img_button);
        linePageIndicator = (LinePageIndicator)findViewById(R.id.pageIndicator);
        registerViewpagerAdapter = new RegisterViewpagerAdapter(this, HostRegisterTourImgData.getBitmaps(),linePageIndicator);
        uploadButton.setOnClickListener(new HostRegisterOnclickListener(this));
        deleteButton.setOnClickListener(new HostRegisterOnclickListener(this,registerViewpagerAdapter,linePageIndicator));
        initPager();
        tourLayout = (LinearLayout)findViewById(R.id.tourLayout);
        editTourLayout = (LinearLayout)findViewById(R.id.edit_tourLayout);
        editButton = (Button)findViewById(R.id.edit_button);
        saveButton = (Button)findViewById(R.id.save_button);
        tourMainTitleText = (TextView)findViewById(R.id.tour_main_title_text);
        tourSubTitleText = (TextView)findViewById(R.id.tour_sub_title_text);
        tourExplanationText = (TextView)findViewById(R.id.tour_explanation_text);
        tourMainTitleEdit = (EditText)findViewById(R.id.tour_main_title_edit);
        tourSubTitleEdit = (EditText)findViewById(R.id.tour_sub_title_edit);
        tourExplanationEdit = (EditText)findViewById(R.id.tour_explanation_edit);
        editButton.setOnClickListener(new HostRegisterOnclickListener(editTourLayout,tourLayout));
        saveButton.setOnClickListener(new HostRegisterOnclickListener(tourMainTitleText,tourSubTitleText,tourExplanationText,tourMainTitleEdit,tourSubTitleEdit,tourExplanationEdit,tourLayout,editTourLayout));

    }



    private void initPager(){
        viewPager = (ViewPager)findViewById(R.id.tour_image_viewpager);
        viewPager.setAdapter(registerViewpagerAdapter);
        linePageIndicator.setViewPager(viewPager);
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerViewpagerAdapter.notifyDataSetChanged();
    }
}
