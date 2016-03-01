package followfellow.liadsoft.com.guest.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import followfellow.liadsoft.com.R;

/**
 * Created by Fwang on 2015. 10. 31..
 */
public class LikesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(
            R.layout.fragment_likes, container, false);
        ButterKnife.bind(this,rootView);
        return rootView;
    }

}
