package followfellow.liadsoft.com.guest.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.ListRecyclerViewAdapter;
import followfellow.liadsoft.com.guest.model.RecyclerViewItemData;

/**
 * Created by Fwang on 2015. 10. 31..
 */
public class ListFragment extends Fragment {
    private RecyclerView.LayoutManager listLayoutManager;
    private RecyclerView listRecyclerView;
    private ListRecyclerViewAdapter listRecyclerViewAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(
                R.layout.fragment_list, container, false);
        listRecyclerView = (RecyclerView)rootView.findViewById(R.id.list_recycle_view);
        initRecycleView();
        return rootView;
    }
    private void initRecycleView(){
        listLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        listRecyclerView.setLayoutManager(listLayoutManager);
        listRecyclerViewAdapter = new ListRecyclerViewAdapter(getActivity().getBaseContext(), RecyclerViewItemData.getAllListItemList());
        listRecyclerView.setAdapter(listRecyclerViewAdapter);
    }

}
