package followfellow.liadsoft.com.host.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.host.view.activity.HostRegisterActivity;

/**
 * Created by Gunter on 2016-01-22.
 */
public class HostRegisterFragment extends Fragment {
    @Bind(R.id.button) Button button;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(
                R.layout.h_fragment_register, container, false);
        ButterKnife.bind(this,rootView);
        return rootView;
    }
    @OnClick(R.id.button)
    void onClickButton(){
        Intent intent = new Intent(getActivity().getBaseContext(), HostRegisterActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getActivity().getBaseContext().startActivity(intent);
    }

}
