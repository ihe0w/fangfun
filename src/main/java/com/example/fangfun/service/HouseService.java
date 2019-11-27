package com.example.fangfun.service;

import com.example.fangfun.common.ResponseResult;
import com.example.fangfun.dto.HouseItemDTO;
import com.example.fangfun.dto.HouseItemList;
import com.example.fangfun.model.House;
import com.example.fangfun.model.RentalSelectionCondition;

import java.util.List;

/**1. 展示房屋信息（描述，图片，视频，价格等）
 * */

//todo 点击了house_item要返回house_infor , landlord_infor 怎么办？那怕是要use userDao
//todo如果用户点击了location 的分类，再要price的分类怎么办？
// 1. combine conditions to find again Y now not consider performance , front end are reponsible for pass all conditions to end，
// 还是以市级分表好,那是view还是table呢？
// 2.select from the former result
// 3. force user request at the same time
public interface HouseService {
//todo must provide service that present default select page
    ResponseResult<HouseItemList> selectHousesByConditions(RentalSelectionCondition rentalSelectionCondition);
}
