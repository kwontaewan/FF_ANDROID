package followfellow.liadsoft.com.host.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.CalendarFragmentOnclickListener;
import followfellow.liadsoft.com.host.control.HostCalendarViewListener;
import followfellow.liadsoft.com.host.control.adapter.HostCalendarRecyclerAdapter;

/**
 * Created by Gunter on 2016-01-22.
 */
public class HostCalendarFragment extends Fragment {
    private CompactCalendarView compactCalendarView;
    private TextView calendarText;
    private ImageView calendarBack;
    private ImageView calendarForward;
    private SimpleDateFormat df;
    private Calendar today;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView calenderRecyclerView;
    private HostCalendarRecyclerAdapter hostCalendarRecyclerAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(
                R.layout.h_fragment_calendar, container, false);
        today = Calendar.getInstance();
        calendarBack = (ImageView)rootView.findViewById(R.id.h_calender_back);
        calendarForward = (ImageView)rootView.findViewById(R.id.h_calender_forward);
        calendarText=(TextView)rootView.findViewById(R.id.h_calender_text);
        calendarText.setText(today.get(Calendar.YEAR)+"년"+today.get(Calendar.MONTH)+1+"월");

        //Initialising calendar
        compactCalendarView = (CompactCalendarView)rootView.findViewById(R.id.h_compactcalendar_view);
        df = new SimpleDateFormat("yyyy년MM월");
        initCalendar();

        compactCalendarView.setListener(new HostCalendarViewListener(getActivity().getBaseContext(),df,calendarText));
        //해당 이미지 뷰를 터치하면 월이 바뀐다.
        calendarBack.setOnClickListener(new CalendarFragmentOnclickListener(compactCalendarView));
        calendarForward.setOnClickListener(new CalendarFragmentOnclickListener(compactCalendarView));

        //Initialising RecyclerView
        calenderRecyclerView = (RecyclerView)rootView.findViewById(R.id.h_calender_recycler_view);
        initRecyclerView();
        return rootView;
    }

    private void initCalendar(){
        compactCalendarView.drawSmallIndicatorForEvents(true);
        compactCalendarView.setLocale(Locale.KOREAN);
        compactCalendarView.setUseThreeLetterAbbreviation(true);
    }

    private void initRecyclerView(){
        layoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        calenderRecyclerView.setLayoutManager(layoutManager);
        hostCalendarRecyclerAdapter = new HostCalendarRecyclerAdapter(getActivity().getBaseContext());
        calenderRecyclerView.setAdapter(hostCalendarRecyclerAdapter);
    }
}
