package apc.lee.kyle.apcmegaphone;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gc on 12/1/2016.
 */

public class SecondFragment extends Fragment {

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView  = inflater.inflate( R.layout.second_layout, container, false);
        return myView;
    }
}
