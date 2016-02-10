package followfellow.liadsoft.com.host.control;

import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

/**
 * Created by Gunter on 2016-02-06.
 */
public class SpinnerOnItemSelected implements AdapterView.OnItemSelectedListener {
    LinearLayout locationIcons;
    LinearLayout languageIcons;
    LinearLayout transportationIcons;

    public SpinnerOnItemSelected(LinearLayout locationIcons, LinearLayout languageIcons, LinearLayout transportationIcons) {
        this.locationIcons = locationIcons;
        this.languageIcons = languageIcons;
        this.transportationIcons = transportationIcons;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                locationIcons.setVisibility(View.VISIBLE);
                languageIcons.setVisibility(View.GONE);
                transportationIcons.setVisibility(View.GONE);
                break;
            case 1:
                locationIcons.setVisibility(View.GONE);
                languageIcons.setVisibility(View.VISIBLE);
                transportationIcons.setVisibility(View.GONE);
                break;
            case 2:
                locationIcons.setVisibility(View.GONE);
                languageIcons.setVisibility(View.GONE);
                transportationIcons.setVisibility(View.VISIBLE);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
