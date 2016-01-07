package followfellow.liadsoft.com.guest.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.HomeRecyclerViewAdapter;

/**
 * Created by Fwang on 2015. 10. 31..
 */
public class MainFragment extends Fragment {
    private RecyclerView.LayoutManager listLayoutManger;
    private RecyclerView homeRecyclerView;
    private HomeRecyclerViewAdapter homeRecyclerViewAdapter;
    private RecyclerViewHeader header;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(
                R.layout.fragment_main, container, false);
        homeRecyclerView = (RecyclerView)rootView.findViewById(R.id.home_recycler_view);
        header=(RecyclerViewHeader)rootView.findViewById(R.id.header);
        initRecycleView();
        return rootView;
    }
    private void initRecycleView(){
        listLayoutManger = new LinearLayoutManager(getActivity().getBaseContext());
        homeRecyclerView.setLayoutManager(listLayoutManger);
        homeRecyclerViewAdapter = new HomeRecyclerViewAdapter(getActivity().getBaseContext());
        homeRecyclerView.setAdapter(homeRecyclerViewAdapter);
        header.attachTo(homeRecyclerView,true);
    }

}
