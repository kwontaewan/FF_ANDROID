package followfellow.liadsoft.com.guest.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.ListRecyclerViewAdapter;
import followfellow.liadsoft.com.guest.model.RecyclerViewItemData;

/**
 * Created by Fwang on 2015. 10. 31..
 */
public class ListFragment extends Fragment {
    private RecyclerView.LayoutManager listLayoutManager;
    private ListRecyclerViewAdapter listRecyclerViewAdapter;
    private ArrayAdapter adapter;
    private ArrayAdapter adapter2;
    private ArrayAdapter adapter3;

    @Bind(R.id.list_recycle_view) RecyclerView listRecyclerView;
    @Bind(R.id.downView) LinearLayout linearLayout;
    @Bind(R.id.search_button) Button button;
    @Bind(R.id.Locating_spinner) Spinner LocationSpinner;
    @Bind(R.id.Locating_spinner2) Spinner LocationSpinner2;
    @Bind(R.id.Language_spinner) Spinner LanguageSpinner;
    @Bind(R.id.list_recycle_view_header) RecyclerViewHeader header;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState)
    {
        final View rootView = inflater.inflate(
                R.layout.fragment_list, container, false);
        ButterKnife.bind(this,rootView);
        initRecycleView();
        initSpinner();
        return rootView;
    }
    private void initRecycleView(){
        listLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        listRecyclerView.setLayoutManager(listLayoutManager);
        listRecyclerViewAdapter = new ListRecyclerViewAdapter(getActivity().getBaseContext(), RecyclerViewItemData.getAllListItemList());
        listRecyclerView.setAdapter(listRecyclerViewAdapter);
        header.attachTo(listRecyclerView,true);

    }

    private void initSpinner(){
        //Location 1 init
        adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.city_data,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        LocationSpinner.setAdapter(adapter);
        //Location 2 init
        adapter2 = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.dong_data,R.layout.support_simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        LocationSpinner2.setAdapter(adapter2);
        //Language init
        adapter3 = ArrayAdapter.createFromResource(getActivity().getBaseContext(),R.array.language_data,R.layout.support_simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        LanguageSpinner.setAdapter(adapter3);
    }


}
