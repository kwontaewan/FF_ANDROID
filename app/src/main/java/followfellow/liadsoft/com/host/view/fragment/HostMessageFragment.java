package followfellow.liadsoft.com.host.view.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;

/**
 * Created by Gunter on 2016-01-22.
 */
public class HostMessageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(
                R.layout.h_fragment_message, container, false);
        ButterKnife.bind(this,rootView);
        return rootView;
    }

}
