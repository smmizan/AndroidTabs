package me.smmizan.androidtabs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);


        MyCustomViewPager(viewPager);
        MyCustomViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }

    void MyCustomViewPager(ViewPager viewPager){

        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter.addMyFragment(new FragmentOne(), "One");
        myAdapter.addMyFragment(new FragmentTwo(), "Two");
        myAdapter.addMyFragment(new FragmentThree(), "Three");
        myAdapter.addMyFragment(new FragmentFour(), "Four");

        viewPager.setAdapter(myAdapter);

    }



}
