package com.example.fangfun.dao;

import com.example.fangfun.model.User;

public interface UserDao {
    /**我在这里使用了account是因为考虑到以后或许是用email，phone来作为账号登录的*/
    User selectUserByAccount(String account);

    String selectPasswordById(int userId);

    int insertUser(User user);


}
