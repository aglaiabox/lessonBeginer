package com.company.professions;

public class Driver extends Person {
    int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString()    {
    String info = "водитель: "+ fullName +", " + experience;
        return info;
    }
    }
