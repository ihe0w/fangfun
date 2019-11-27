package com.example.fangfun.dto;

import java.io.Serializable;
import java.util.List;

public class HouseItemList implements Serializable {
    /**暂时返回所有符合筛选条件的houseItem*/
    private List<HouseItemDTO> houseItemDTOS;
    private Integer minPrice;
    private Integer maxPrice;
    private Integer count;

    public List<HouseItemDTO> getHouseItemDTOS() {
        return houseItemDTOS;
    }

    public void setHouseItemDTOS(List<HouseItemDTO> houseItemDTOS) {
        this.houseItemDTOS = houseItemDTOS;
    }
}
