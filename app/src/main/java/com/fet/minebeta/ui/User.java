package com.fet.minebeta.ui;

/**
 * Created by FET on 27/08/2016.
 * All rights reserved.
 * Please contact @fettucciari.leonardo@gmail.com
 */
public class User {

    private String mName;
    private int mGold;
    private int mExperience;
    private int mExperienceLevel;

    public User(String name){
        mName = name;
        mGold = 0;
        mExperience = 0;
        mExperienceLevel = 1;
    }

    // Getters & Setters
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getGold() {
        return mGold;
    }

    public void setGold(int gold) {
        mGold = gold;
    }

    public int getExperience() {
        return mExperience;
    }

    public void setExperience(int experience) {
        mExperience = experience;
    }

    public int getExperienceLevel() {
        return mExperienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        mExperienceLevel = experienceLevel;
    }
}
