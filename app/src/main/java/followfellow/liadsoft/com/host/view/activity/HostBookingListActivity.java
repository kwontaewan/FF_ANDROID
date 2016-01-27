package followfellow.liadsoft.com.host.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.HostBookingListNavigationOnClickListener;
import followfellow.liadsoft.com.host.control.adapter.HostBookingRecyclerAdapter;

/**
 * Created by Gunter on 2016-01-25.
 */
public class HostBookingListActivity extends AppCompatActivity {
    private Toolbar toolbar;

    private RecyclerView.LayoutManager listLayoutManger;
    private RecyclerView bookingRecyclerView;
    private HostBookingRecyclerAdapter hostBookingRecyclerAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_booking_list);

        //Initialising toolBar
        toolbar = (Toolbar)findViewById(R.id.h_booking_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_action_cancel);
        toolbar.setNavigationOnClickListener(new HostBookingListNavigationOnClickListener(this));

        bookingRecyclerView = (RecyclerView)findViewById(R.id.h_booking_recycler_view);
        initRecyclerView();
    }

    private void initRecyclerView(){
        listLayoutManger = new LinearLayoutManager(getApplicationContext());
        bookingRecyclerView.setLayoutManager(listLayoutManger);
        hostBookingRecyclerAdapter = new HostBookingRecyclerAdapter(this);
        bookingRecyclerView.setAdapter(hostBookingRecyclerAdapter);

    }
}
