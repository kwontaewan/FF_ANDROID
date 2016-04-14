package followfellow.liadsoft.com.host.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.HostBookingListNavigationOnClickListener;
import followfellow.liadsoft.com.host.control.adapter.HostBookingRecyclerAdapter;

/**
 * Created by Gunter on 2016-01-25.
 */
public class HostBookingListActivity extends AppCompatActivity {
    @Bind(R.id.h_booking_toolbar) Toolbar toolbar;
    @Bind(R.id.h_booking_recycler_view) RecyclerView bookingRecyclerView;
    private RecyclerView.LayoutManager listLayoutManger;
    private HostBookingRecyclerAdapter hostBookingRecyclerAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_activity_booking_list);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_action_cancel);
        toolbar.setTitle("");
        toolbar.setNavigationOnClickListener(new HostBookingListNavigationOnClickListener(this));
        initRecyclerView();
    }

    private void initRecyclerView(){
        listLayoutManger = new LinearLayoutManager(getApplicationContext());
        bookingRecyclerView.setLayoutManager(listLayoutManger);
        hostBookingRecyclerAdapter = new HostBookingRecyclerAdapter(this);
        bookingRecyclerView.setAdapter(hostBookingRecyclerAdapter);

    }
}
