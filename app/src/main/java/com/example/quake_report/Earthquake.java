package com.example.quake_report;


public class Earthquake {

    private int mMagnitude;
    private String mLocation;
    private String mDate;


    public Earthquake(int magnitude, String location, String date) {

        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;

    }

    public int getmMagnitude() {

        return mMagnitude;

    }

    public String getmLocation() {

        return mLocation;

    }

    public String getmDate() {

        return mDate;

    }

}






