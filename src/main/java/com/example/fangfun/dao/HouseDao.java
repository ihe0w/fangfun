package com.example.fangfun.dao;

import com.example.fangfun.dto.HouseItemDTO;
import com.example.fangfun.model.House;
import com.example.fangfun.model.RentalSelectionCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseDao {
    //todo I don't want pass 5 params ,but I have no idea! no I have
    //todo 我好像是能用多级查询的!
    //attention
    List<HouseItemDTO> selectHousesByConditions(@Param("condition") RentalSelectionCondition condition);

}
