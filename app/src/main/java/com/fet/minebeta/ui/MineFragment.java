package com.fet.minebeta.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.fet.minebeta.R;

/**
 * Created by FET on 27/08/2016.
 * All rights reserved.
 * Please contact @fettucciari.leonardo@gmail.com
 */
public class MineFragment extends Fragment {
    // Store instance variables
    private String mName;
    private String mMineral;
    private int mUnlockCost;
    private int mDropRate;
    private int mLayout;
    private boolean mIsUnlocked;

    private Button mineUnlockButton;
    private View overlay;

    // newInstance constructor for creating fragment with arguments
    public static MineFragment newInstance(String name, String mineral, int unlockCost, int dropRate, int layout) {
        MineFragment mineFragment = new MineFragment();
        Bundle args = new Bundle();

        args.putString("MINE_NAME", name);
        args.putString("MINE_MINERAL", mineral);
        args.putInt("MINE_COST", unlockCost);
        args.putInt("MINE_RATE", dropRate);
        args.putInt("MINE_LAYOUT", layout);

        mineFragment.setArguments(args);
        return mineFragment;
    }

    // newInstance constructor for creating fragment with arguments + IsUnlocked
    public static MineFragment newInstance(String name, String mineral, int unlockCost, int dropRate, int layout, boolean isUnlocked) {
        MineFragment mineFragment = new MineFragment();
        Bundle args = new Bundle();

        args.putString("MINE_NAME", name);
        args.putString("MINE_MINERAL", mineral);
        args.putInt("MINE_COST", unlockCost);
        args.putInt("MINE_RATE", dropRate);
        args.putInt("MINE_LAYOUT", layout);
        args.putBoolean("MINE_IS_UNLOCKED", isUnlocked);

        mineFragment.setArguments(args);
        return mineFragment;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mName = getArguments().getString("MINE_NAME");
        mMineral = getArguments().getString("MINE_MINERAL");
        mUnlockCost = getArguments().getInt("MINE_COST");
        mDropRate = getArguments().getInt("MINE_RATE");
        mLayout = getArguments().getInt("MINE_LAYOUT");
        mIsUnlocked = getArguments().getBoolean("MINE_IS_UNLOCKED", false);

    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(mLayout, container, false);

        TextView mineName = (TextView) view.findViewById(R.id.mineName);
        TextView mineCost = (TextView) view.findViewById(R.id.mineCost);
        TextView mineMineral = (TextView) view.findViewById(R.id.mineMineral);
        TextView mineDropRate = (TextView) view.findViewById(R.id.mineDropRate);
        mineUnlockButton = (Button) view.findViewById(R.id.unlockButton);
        overlay = view.findViewById(R.id.grayOverlay);

        mineName.setText(mName);
        mineCost.setText(String.valueOf(mUnlockCost));
        mineMineral.setText(mMineral);
        mineDropRate.setText(String.valueOf(mDropRate));
        mineUnlockButton.setText(String.valueOf(mUnlockCost));

        return view;
    }

}
