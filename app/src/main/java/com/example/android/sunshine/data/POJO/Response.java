package com.example.android.sunshine.data.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Response {


    @SerializedName("list")
    private List<ListItem> list;

    public List<ListItem> getList() {
        return list;
    }

    public void setList(List<ListItem> list) {
        this.list = list;
    }
}