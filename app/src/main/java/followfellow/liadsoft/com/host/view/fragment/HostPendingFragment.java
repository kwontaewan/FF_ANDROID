package followfellow.liadsoft.com.host.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import followfellow.liadsoft.com.R;
/**
 * Created by user on 2016-01-22.
 */
public class HostPendingFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(
                R.layout.h_fragment_pending, container, false);
        return rootView;
    }

}
