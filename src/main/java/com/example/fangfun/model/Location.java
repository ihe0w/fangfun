package com.example.fangfun.model;

import java.io.Serializable;


public class Location implements Serializable {
    //todo 好像并不一定要这不能为null，要是有一个为null就没有location条件
    //国家3 province 3 city 3 county 3
    private String locationId;
    //level 0 country 1 province 2 city 3 county
    private Byte level;

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
}
