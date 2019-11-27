package com.example.fangfun.service.ServiceImpl;

import com.example.fangfun.common.ResponseResult;
import com.example.fangfun.dao.HouseDao;
import com.example.fangfun.dto.HouseItemDTO;
import com.example.fangfun.dto.HouseItemList;
import com.example.fangfun.model.RentalSelectionCondition;
import com.example.fangfun.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseServiceImpl implements HouseService {
    final
    HouseDao houseDao;

    public HouseServiceImpl(HouseDao houseDao) {
        this.houseDao = houseDao;
    }

    @Override
    public ResponseResult<HouseItemList> selectHousesByConditions(RentalSelectionCondition rentalSelectionCondition) {
        //todo assert rentalSelectionCondition.minPrice>= minPrice selected by,so did param maxPrice. not mingle locationId and level
        List<HouseItemDTO> houseItemDTOS=houseDao.selectHousesByConditions(rentalSelectionCondition);
        if (houseItemDTOS==null){
            return ResponseResult.failed("sorry,我们没有找到符合筛选条件的房屋");
        }

        HouseItemList houseItemList=new HouseItemList();
        houseItemList.setHouseItemDTOS(houseItemDTOS);

        return ResponseResult.success(houseItemList);
    }
}
