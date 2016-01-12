package followfellow.liadsoft.com.guest.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

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
    private ImageView imageTest;
    private ImageView imageTest2;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState)
    {
        final View rootView = inflater.inflate(
                R.layout.fragment_list, container, false);
        listRecyclerView = (RecyclerView)rootView.findViewById(R.id.list_recycle_view);
        ///<---                         고쳐야되는 부분                     ----->///
        imageTest = (ImageView)rootView.findViewById(R.id.imgTest);
        imageTest2 = (ImageView)rootView.findViewById(R.id.imgTest2);
        final LinearLayout linearLayout = (LinearLayout)rootView.findViewById(R.id.downView);

        imageTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.VISIBLE);
            }
        });
        imageTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.GONE);
            }
        });
        ///<---                         고쳐야되는 부분                     ----->///
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
