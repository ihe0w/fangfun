package com.example.fangfun.controller;

import com.example.fangfun.common.ResponseResult;
import com.example.fangfun.model.User;
import com.example.fangfun.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

//todo
@Controller
@RestController
@RequestMapping(value = "/user")
public class UserController {
    //todo 所以如果我改变登陆注册方式为验证码那这个接口应该如何设计呢？
    private final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //todo the problem is still
    @RequestMapping(value = "login",method = RequestMethod.POST )
    @ResponseBody
    public ResponseResult<User> login(@RequestBody User user){
        ResponseResult<User> responseResult=userService.login(user);
//        if (ResponseResult.isSuccess())
//            session.setAttribute(.CURRENT_USER,serverResponse.getData());
        return responseResult;
    }


}
