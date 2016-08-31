package com.fet.minebeta.ui;

/**
 * Created by FET on 27/08/2016.
 * All rights reserved.
 * Please contact @fettucciari.leonardo@gmail.com
 */
public class Mineral {
    private String mName;
    private int mValue;

    public Mineral(String name, int value){
        mName = name;
        mValue = value;
    }

    // Getters & Setters
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getValue() {
        return mValue;
    }

    public void setValue(int value) {
        mValue = value;
    }
}
