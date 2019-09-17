package absa.cgs.com.bottomnavigation;

import android.app.Fragment;
import android.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

import androidx.legacy.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter {
    private List<android.app.Fragment> Fragment = new ArrayList<>(); //Fragment List
    private List<String> NamePage = new ArrayList<>(); // Fragment Name List

    public FragmentAdapter(FragmentManager manager) {
        super(manager);
    }

    public void add(Fragment Frag, String Title) {
        Fragment.add(Frag);
        NamePage.add(Title);
    }

    @Override
    public Fragment getItem(int position) {
        return Fragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return NamePage.get(position);
    }

    @Override
    public int getCount() {
        return Fragment.size();
    }
}