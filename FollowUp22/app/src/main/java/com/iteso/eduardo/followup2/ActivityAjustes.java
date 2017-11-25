package com.iteso.eduardo.followup2;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ActivityAjustes extends AppCompatActivity {
    Toolbar toolbar_ajustes;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        toolbar_ajustes = (Toolbar)findViewById(R.id.toolbar_ajustes);
        tabLayout = (TabLayout)findViewById(R.id.tabs);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        setSupportActionBar(toolbar_ajustes);
        SectionsAdapter mSection =
                new SectionsAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mSection);
        tabLayout.setupWithViewPager(viewPager);
    }
    public class SectionsAdapter extends FragmentPagerAdapter{
        public SectionsAdapter(FragmentManager fm) {super(fm);}
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return  new ActivityLoggs();
                case 1:
                    return  new ActivityTemas();
                default:
                    return  new ActivityTemas();
            }
        };
        @Override
        public int getCount() {
            return 2;
        }
        @Override
        public CharSequence getPageTitle(int pos) {
            switch (pos){
                case 0: return getString(R.string.title_section1);
                case 1: return getString(R.string.title_section2);
            }
            return super.getPageTitle(pos);
        }
    }


}
