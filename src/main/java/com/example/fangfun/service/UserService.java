package com.example.fangfun.service;

import com.example.fangfun.common.ResponseResult;
import com.example.fangfun.model.User;
import org.springframework.stereotype.Service;


public interface UserService {
    /**@param user needed infor account,password
     * @return */
    ResponseResult<User> register(User user);

    /***/
    ResponseResult<User> login(User user);

    User getUserByName(String userName);
}
