package followfellow.liadsoft.com.host.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.control.adapter.HostPendingRecyclerViewAdapter;
import followfellow.liadsoft.com.host.model.HostRecyclerViewItemData;

/**
 * Created by Gunter on 2016-01-22.
 */
public class HostPendingFragment extends Fragment {
    @Bind(R.id.h_pending_recycler_view) RecyclerView pendingRecyclerView;
    private RecyclerView.LayoutManager listLayoutManager;
    private HostPendingRecyclerViewAdapter pendingRecyclerViewAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(
                R.layout.h_fragment_pending, container, false);
        ButterKnife.bind(this,rootView);
        initRecyclerView();
        return rootView;

    }
    private void initRecyclerView(){
        listLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        pendingRecyclerView.setLayoutManager(listLayoutManager);
        pendingRecyclerViewAdapter = new HostPendingRecyclerViewAdapter(getActivity().getBaseContext(), HostRecyclerViewItemData.getAllPedingItemList());
        pendingRecyclerView.setAdapter(pendingRecyclerViewAdapter);
    }

}
