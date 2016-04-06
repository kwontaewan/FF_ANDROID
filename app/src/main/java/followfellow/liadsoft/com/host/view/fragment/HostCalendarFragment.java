package followfellow.liadsoft.com.host.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.adapter.HostCalendarRecyclerAdapter;

/**
 * Created by Gunter on 2016-01-22.
 */
public class HostCalendarFragment extends Fragment {
    private CalendarView compactCalendarView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView calenderRecyclerView;
    private HostCalendarRecyclerAdapter hostCalendarRecyclerAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(
                R.layout.h_fragment_calendar, container, false);
        //calendarText=(TextView)rootView.findViewById(R.id.h_calender_text);
        //calendarText.setText(today.get(Calendar.YEAR)+"년"+today.get(Calendar.MONTH)+1+"월");

        //Initialising calendar
        compactCalendarView = (CalendarView) rootView.findViewById(R.id.h_compactcalendar_view);

        //Initialising RecyclerView
        calenderRecyclerView = (RecyclerView)rootView.findViewById(R.id.h_calender_recycler_view);
        initRecyclerView();
        return rootView;
    }

    private void initRecyclerView(){
        layoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        calenderRecyclerView.setLayoutManager(layoutManager);
        hostCalendarRecyclerAdapter = new HostCalendarRecyclerAdapter(getActivity().getBaseContext());
        calenderRecyclerView.setAdapter(hostCalendarRecyclerAdapter);
    }
}
