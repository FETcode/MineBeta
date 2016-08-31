package com.fet.minebeta;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.fet.minebeta.ui.MineAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FragmentPagerAdapter adapterViewPager;
    ViewPager viewPager;

    private Button mineUnlockButton;
    View overlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MineAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);

        // Initializing
        mineUnlockButton = (Button) findViewById(R.id.unlockButton);
        overlay = findViewById(R.id.grayOverlay);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.unlockButton: // If mine purchased successfully, remove overlay and button
                overlay.setVisibility(View.GONE);
                v.setVisibility(View.GONE);
                System.out.println("### Mine Purchased ###");
                break;
        }
    }


}