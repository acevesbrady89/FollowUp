package com.aceves89gmail.sergio.proyecto;

import android.content.Intent;
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
import android.widget.Button;
import android.widget.Toast;

public class activityRules extends AppCompatActivity {
    Toolbar toolbar_ajustes;
    TabLayout tabLayout;
    ViewPager viewPager;
    Button buton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        toolbar_ajustes = (Toolbar) findViewById(R.id.toolbar_ajustes);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        buton=(Button) findViewById(R.id.fragment_instruction3_boton);
        setSupportActionBar(toolbar_ajustes);
        SectionsAdapterI mSection =
                new SectionsAdapterI(getSupportFragmentManager());
        viewPager.setAdapter(mSection);
        tabLayout.setupWithViewPager(viewPager);



    }

    public class SectionsAdapterI extends FragmentPagerAdapter {
        public SectionsAdapterI(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return FragInstructions.newInstance();
                case 1:
                    return FragInstructions2.newInstance();
                case 2:
                    return FragInstructions3.newInstance();
                default:
                    return FragInstructions.newInstance();
            }
        };
        @Override
        public int getCount() {
            return 3;
        }
        @Override
        public CharSequence getPageTitle(int pos) {
            switch (pos){
                case 0: return getString(R.string.title_sectionI1);
                case 1: return getString(R.string.title_sectionI2);
                case 2: return getString(R.string.title_sectionI3);
            }
            return super.getPageTitle(pos);
        }

    }
    public static class FragInstructions extends Fragment{
        public static FragInstructions newInstance(){
            FragInstructions fragment = new FragInstructions();
            return fragment;
        }
        public FragInstructions(){}
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_instruction1, container, false);
        }
    }
    public static class FragInstructions2 extends Fragment{
        public static FragInstructions2 newInstance(){
            FragInstructions2 fragment = new FragInstructions2();
            return fragment;
        }
        public FragInstructions2(){}
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_instruction2, container, false);
        }
    }
    public static class FragInstructions3 extends Fragment{
        Button buton;
        public static FragInstructions3 newInstance(){
            FragInstructions3 fragment = new FragInstructions3();

            return fragment;
        }


        public FragInstructions3(){}
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view =inflater.inflate(R.layout.fragment_instruction3, container, false);
            buton=(Button) view.findViewById(R.id.fragment_instruction3_boton);

            buton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(((activityRules)getActivity()),ActivityMain.class);
                    startActivity(intent);
                    ((activityRules)getActivity()).finish();
                }
            });


            return view;


        }


    }


}

