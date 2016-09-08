package com.fet.minebeta.ui;

/**
 * Created by FET on 27/08/2016.
 * All rights reserved.
 * Please contact @fettucciari.leonardo@gmail.com
 */
public class User {
    private String userName;
    private int gold;
    private int experience;
    private int experienceLevel = 1;

    /**
     * @param userName
     * @param gold
     * @param experience
     * @param experienceLevel
     */
    public User(String userName, int gold, int experience, int experienceLevel) {
        this.userName = userName;
        this.gold = gold;
        this.experience = experience;
        this.experienceLevel = experienceLevel;
    }

    //Setters

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    //Getters

    public String getUserName() {
        return userName;
    }

    public int getGold() {
        return gold;
    }

    public int getExperience() {
        return experience;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }
}