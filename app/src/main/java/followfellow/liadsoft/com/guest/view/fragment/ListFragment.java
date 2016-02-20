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
    private LinearLayout linearLayout;
    private Button button;
    private Spinner LocationSpinner;
    private Spinner LocationSpinner2;
    private Spinner LanguageSpinner;
    private ArrayAdapter adapter;
    private ArrayAdapter adapter2;
    private ArrayAdapter adapter3;
    private RecyclerViewHeader header;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState)
    {
        final View rootView = inflater.inflate(
                R.layout.fragment_list, container, false);

        listRecyclerView = (RecyclerView)rootView.findViewById(R.id.list_recycle_view);
        LocationSpinner = (Spinner)rootView.findViewById(R.id.Locating_spinner);
        LocationSpinner2 = (Spinner)rootView.findViewById(R.id.Locating_spinner2);
        LanguageSpinner = (Spinner)rootView.findViewById(R.id.Language_spinner);
        button = (Button)rootView.findViewById(R.id.search_button);
        linearLayout = (LinearLayout)rootView.findViewById(R.id.downView);
        header = (RecyclerViewHeader)rootView.findViewById(R.id.list_recycle_view_header);
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
