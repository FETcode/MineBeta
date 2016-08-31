package com.fet.minebeta.ui;

/**
 * Created by FET on 27/08/2016.
 * All rights reserved.
 * Please contact @fettucciari.leonardo@gmail.com
 */
public class Mine {
    private String mName;
    private Mineral mMineral;
    private int mUnlockCost;
    private int mDropRate;

    public Mine(String name, Mineral mineral, int cost, int dropRate){
        mName = name;
        mMineral = mineral;
        mUnlockCost = cost;
        mDropRate = dropRate;
    }

    // Getters & Setters

    public String getmName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public Mineral getMineral() {
        return mMineral;
    }

    public void setMineral(Mineral mMineral) {
        this.mMineral = mMineral;
    }

    public int getUnlockCost() {
        return mUnlockCost;
    }

    public void setUnlockCost(int mUnlockCost) {
        this.mUnlockCost = mUnlockCost;
    }

    public int getDropRate() {
        return mDropRate;
    }

    public void setDropRate(int mDropRate) {
        this.mDropRate = mDropRate;
    }


}
