package com.example.android.sunshine.data.POJO;

import com.google.gson.annotations.SerializedName;


public class WeatherItem {
    @SerializedName("id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}