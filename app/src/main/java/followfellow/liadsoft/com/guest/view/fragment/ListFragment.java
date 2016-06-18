package followfellow.liadsoft.com.guest.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.ListRecyclerViewAdapter;
import followfellow.liadsoft.com.guest.model.RecyclerViewItemData;
import followfellow.liadsoft.com.guest.view.activity.DestinationActivity;

/**
 * Created by Fwang on 2015. 10. 31..
 */
public class ListFragment extends Fragment {
    private RecyclerView.LayoutManager listLayoutManager;
    private ListRecyclerViewAdapter listRecyclerViewAdapter;

    @Bind(R.id.list_recycle_view) RecyclerView listRecyclerView;
    @Bind(R.id.filter_button) Button button;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState)
    {
        final View rootView = inflater.inflate(
                R.layout.fragment_list, container, false);
        ButterKnife.bind(this,rootView);
        initRecycleView();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getBaseContext(), DestinationActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
    private void initRecycleView(){
        listLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        listRecyclerView.setLayoutManager(listLayoutManager);
        listRecyclerViewAdapter = new ListRecyclerViewAdapter(getActivity().getBaseContext(), RecyclerViewItemData.getAllHomeItemList());
        listRecyclerView.setAdapter(listRecyclerViewAdapter);

    }



}
