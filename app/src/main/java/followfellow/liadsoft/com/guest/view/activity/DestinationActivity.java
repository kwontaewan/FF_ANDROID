package followfellow.liadsoft.com.guest.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.DestinationListViewAdapter;

/**
 * Created by user on 2016-03-31.
 */
public class DestinationActivity extends AppCompatActivity {
    @Bind(R.id.destination_listview)
    ExpandableListView listView;
    private ArrayList<String> arrayGroup = new ArrayList<>();
    private HashMap<String,ArrayList<String>> arrayChild = new HashMap<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination_filtering_view);
        ButterKnife.bind(this);
        setArrayData();
        listView.setAdapter(new DestinationListViewAdapter(getApplicationContext(),arrayGroup,arrayChild));
    }
    private void setArrayData(){
        arrayGroup.add("Seoul");
        ArrayList<String> arraySeoul = new ArrayList<>();
        arraySeoul.add("Gangnam/Seocho");
        arraySeoul.add("Sinchon/Hongdae/Mapo");
        arraySeoul.add("Yeouido/Yeongdeungpo/Guro");
        arraySeoul.add("Myeondong/Jongro");
        arrayChild.put(arrayGroup.get(0),arraySeoul);
    }
}
