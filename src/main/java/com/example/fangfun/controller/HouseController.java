package com.example.fangfun.controller;

import com.example.fangfun.common.ResponseResult;
import com.example.fangfun.dto.HouseItemList;
import com.example.fangfun.model.RentalSelectionCondition;
import com.example.fangfun.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/house")
public class HouseController {
    //is too many param if combine all conditions? one class is ok
    final
    HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @RequestMapping(value = "/classify",method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<HouseItemList> selectHousesByConditions(@RequestBody RentalSelectionCondition condition){

        return houseService.selectHousesByConditions(condition);
    }
}
