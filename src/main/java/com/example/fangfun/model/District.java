package com.example.fangfun.model;

import lombok.Data;

import java.io.Serializable;


public class District implements Serializable {
    private String districtId;
    private String parentDistrict;
    private Byte level;
    private String districtName;

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getParentDistrict() {
        return parentDistrict;
    }

    public void setParentDistrict(String parentDistrict) {
        this.parentDistrict = parentDistrict;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
