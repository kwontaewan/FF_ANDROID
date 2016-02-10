package followfellow.liadsoft.com.custom;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.SpinnerOnItemSelected;

/**
 * Created by Gunter on 2016-02-06.
 */
public class CategoryIconDialog extends Dialog{
    Spinner spinner;
    Button acceptButton;
    ArrayAdapter adapter;
    LinearLayout locationIcons;
    LinearLayout languageIcons;
    LinearLayout transportationIcons;
    public CategoryIconDialog(Context context) {
        super(context);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.h_tour_icon_dialog);
        adapter = ArrayAdapter.createFromResource(context,R.array.category_data,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner = (Spinner)findViewById(R.id.category_spinner);
        spinner.setAdapter(adapter);
        locationIcons = (LinearLayout)findViewById(R.id.location_icons);
        languageIcons = (LinearLayout)findViewById(R.id.language_icons);
        transportationIcons = (LinearLayout)findViewById(R.id.transportation_icons);
        spinner.setOnItemSelectedListener(new SpinnerOnItemSelected(locationIcons,languageIcons,transportationIcons));
        acceptButton = (Button)findViewById(R.id.accept_button);
            acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
