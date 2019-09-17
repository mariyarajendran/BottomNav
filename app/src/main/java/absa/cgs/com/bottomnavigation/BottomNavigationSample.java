package absa.cgs.com.bottomnavigation;


import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class BottomNavigationSample extends AppCompatActivity {

    ViewPager viewPager;
    BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_sample);
        initMain();
       // Intent intent = new Intent(BottomNavigationSample.this, NavigationDrawer.class);
        //startActivity(intent);
    }


    public void initMain() {
        navigation = findViewById(R.id.bottom_navigation_view);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        viewPager = findViewById(R.id.view_pager); //Init Viewpager
        setupFm(getFragmentManager(), viewPager); //Setup Fragment
        viewPager.setCurrentItem(0); //Set Currrent Item When Activity Start
        viewPager.setOnPageChangeListener(new PageChange());
    }


    public static void setupFm(FragmentManager fragmentManager, ViewPager viewPager) {
        FragmentAdapter Adapter = new FragmentAdapter(fragmentManager);
        //Add All Fragment To List
        Adapter.add(new FragmentHome(), "Page One");
        Adapter.add(new FragmentEmail(), "Page Two");
        Adapter.add(new FragmentSearch(), "Page Three");
        Adapter.add(new FragmentAccount(), "Page Four");
        viewPager.setAdapter(Adapter);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.bottom_navigation_item_home:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.bottom_navigation_item_email:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.bottom_navigation_item_search:
                    viewPager.setCurrentItem(2);
                    return true;
                case R.id.bottom_navigation_item_account:
                    viewPager.setCurrentItem(3);
                    return true;
            }
            return false;
        }
    };

    public class PageChange implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            switch (position) {
                case 0:
                    navigation.setSelectedItemId(R.id.bottom_navigation_item_home);
                    break;
                case 1:
                    navigation.setSelectedItemId(R.id.bottom_navigation_item_email);
                    break;
                case 2:
                    navigation.setSelectedItemId(R.id.bottom_navigation_item_search);
                    break;
                case 3:
                    navigation.setSelectedItemId(R.id.bottom_navigation_item_account);
                    break;
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }
    }


}
