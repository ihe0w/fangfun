package com.example.fangfun.model;

import java.io.Serializable;


public class RentalSelectionCondition implements Serializable {
    //若minPrice，maxPrice为空的话，则不限制
    private Integer minPrice;
    private Integer MaxPrice;
    //0整租1合租
    private Byte rentType;
    private Location location;


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return MaxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        MaxPrice = maxPrice;
    }

    public Byte getRentType() {
        return rentType;
    }

    public void setRentType(Byte rentType) {
        this.rentType = rentType;
    }
}
