package absa.cgs.com.bottomnavigation;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import absa.cgs.com.bottomnavigation.R;
import androidx.annotation.Nullable;

public class FragmentEmail extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragment_one = inflater.inflate(R.layout.fragment_email, container, false);
        return fragment_one;
    }
}
