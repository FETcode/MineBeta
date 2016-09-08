package com.fet.minebeta;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.fet.minebeta.data.CenterRepository;
import com.fet.minebeta.ui.MineAdapter;
import com.fet.minebeta.ui.User;

public class MainActivity extends AppCompatActivity {

    PagerAdapter adapterViewPager;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MineAdapter(this, R.layout.carousal_page);
        viewPager.setAdapter(adapterViewPager);

        //  Add Test User from Activity
        CenterRepository.getSingletonInstance().setCurrentUser(new User("FET", 1000, 20, 10));

    }



}