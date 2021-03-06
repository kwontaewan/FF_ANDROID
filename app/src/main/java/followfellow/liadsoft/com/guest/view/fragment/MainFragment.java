package followfellow.liadsoft.com.guest.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.Bind;
import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.control.adapter.HomeAutoViewPagerAdapter;
import followfellow.liadsoft.com.guest.control.adapter.HomeRecyclerViewAdapter;
import followfellow.liadsoft.com.guest.model.RecyclerViewItemData;
import followfellow.liadsoft.com.guest.model.ViewPagerData;

/**
 * Created by Fwang on 2015. 10. 31..
 */
public class MainFragment extends Fragment {
    private RecyclerView.LayoutManager listLayoutManger;
    private HomeRecyclerViewAdapter homeRecyclerViewAdapter;
    private HomeAutoViewPagerAdapter homeAutoViewPagerAdapter;

    @Bind(R.id.home_recycler_view) RecyclerView homeRecyclerView;
    @Bind(R.id.header) RecyclerViewHeader header;
    @Bind(R.id.pageIndicator) CirclePageIndicator linePageIndicator;
    @Bind(R.id.viewPager) ViewPager viewPager;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(
                R.layout.fragment_main, container, false);
        ButterKnife.bind(this,rootView);
        initAutoViewPager();
        initRecycleView();
        //viewPager Indicator setting
        linePageIndicator.setViewPager(viewPager);
        return rootView;
    }
    private void initAutoViewPager(){
        homeAutoViewPagerAdapter = new HomeAutoViewPagerAdapter(getActivity().getBaseContext(), ViewPagerData.getAllHomePagerItem());
        viewPager.setAdapter(homeAutoViewPagerAdapter);
    }
    private void initRecycleView(){
        listLayoutManger = new LinearLayoutManager(getActivity().getBaseContext());
        homeRecyclerView.setLayoutManager(listLayoutManger);
        homeRecyclerViewAdapter = new HomeRecyclerViewAdapter(getActivity().getBaseContext(), RecyclerViewItemData.getAllHomeItemList());
        homeRecyclerView.setAdapter(homeRecyclerViewAdapter);
        header.attachTo(homeRecyclerView,true);
    }

}
