package followfellow.liadsoft.com.host.control;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.viewpagerindicator.LinePageIndicator;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.adapter.RegisterViewpagerAdapter;
import followfellow.liadsoft.com.host.model.HostRegisterTourImgData;
import followfellow.liadsoft.com.host.model.HostRegisterTourTextData;
import followfellow.liadsoft.com.util.ImageSelectHelper;

/**
 * Created by Gunter on 2016-01-30.
 */
public class HostRegisterOnclickListener implements View.OnClickListener {
    private ImageSelectHelper imageSelectHelper;
    private LinePageIndicator linePageIndicator;
    private RegisterViewpagerAdapter registerViewpagerAdapter;
    private TextView tourMainTitleText;
    private TextView tourSubTitleText;
    private TextView tourExplanationText;
    private EditText tourMainTitleEdit;
    private EditText tourSubTitleEdit;
    private EditText tourExplanationEdit;
    private LinearLayout tourLayout;
    private LinearLayout editTourLayout;
    private HostRegisterTourTextData hostRegisterTourTextData = new HostRegisterTourTextData();
    private Context context;
    HostRegisterTourImgData registerTourImgData = new HostRegisterTourImgData();
    public HostRegisterOnclickListener(ImageSelectHelper imageSelectHelper) {
        this.imageSelectHelper = imageSelectHelper;
    }
    public HostRegisterOnclickListener(Context context,RegisterViewpagerAdapter registerViewpagerAdapter, LinePageIndicator linePageIndicator){
        this.context = context;
        this.registerViewpagerAdapter = registerViewpagerAdapter;
        this.linePageIndicator = linePageIndicator;
    }
    public HostRegisterOnclickListener(LinearLayout editTourLayout, LinearLayout tourLayout) {
        this.editTourLayout = editTourLayout;
        this.tourLayout = tourLayout;
    }

    public HostRegisterOnclickListener(TextView tourMainTitleText, TextView tourSubTitleText, TextView tourExplanationText, EditText tourMainTitleEdit, EditText tourSubTitleEdit, EditText tourExplanationEdit, LinearLayout tourLayout, LinearLayout editTourLayout) {
        this.tourMainTitleText = tourMainTitleText;
        this.tourSubTitleText = tourSubTitleText;
        this.tourExplanationText = tourExplanationText;
        this.tourMainTitleEdit = tourMainTitleEdit;
        this.tourSubTitleEdit = tourSubTitleEdit;
        this.tourExplanationEdit = tourExplanationEdit;
        this.tourLayout = tourLayout;
        this.editTourLayout = editTourLayout;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.upload_img_button:
                imageSelectHelper.startSelectImage();
                break;
            case R.id.delete_all_img_button:
                if (registerTourImgData.bitmaps.size()!=0) {
                    registerTourImgData.bitmaps.removeAll(registerTourImgData.bitmaps);
                    registerViewpagerAdapter.notifyDataSetChanged();
                    linePageIndicator.notifyDataSetChanged();
                    break;
                } else {
                    Toast.makeText(context,"지울 사진이 없습니다.",Toast.LENGTH_LONG).show();
                }
            case R.id.edit_button:
                tourLayout.setVisibility(View.GONE);
                editTourLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.save_button:
                tourLayout.setVisibility(View.VISIBLE);
                editTourLayout.setVisibility(View.GONE);
                hostRegisterTourTextData.setMainText(tourMainTitleEdit.getText().toString());
                hostRegisterTourTextData.setSubText(tourSubTitleEdit.getText().toString());
                hostRegisterTourTextData.setExplanationText(tourExplanationEdit.getText().toString());
                tourMainTitleText.setText(hostRegisterTourTextData.getMainText());
                tourSubTitleText.setText(hostRegisterTourTextData.getSubText());
                tourExplanationText.setText(hostRegisterTourTextData.getExplanationText());
                break;
        }
    }
}
