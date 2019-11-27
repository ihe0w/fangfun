package com.example.fangfun.service.ServiceImpl;

import com.example.fangfun.common.ResponseResult;
import com.example.fangfun.dao.UserDao;
import com.example.fangfun.model.User;
import com.example.fangfun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    private final
    UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public ResponseResult<User> register(User newUser) {
        //check account,if exit return false
        User userSelected=userDao.selectUserByAccount(newUser.getUserName());
        if (userSelected!=null)
            return ResponseResult.failed("用户名已存在");
        //load user infor to db
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        userDao.insertUser(newUser);

        //return user data without password
        User userReturned=newUser;
        userReturned.setPassword(null);
        return ResponseResult.success(userReturned);
    }

    @Override
    public ResponseResult<User> login(User user) {
        //check user is exist
        //if null or password is not match
        //    return error
        //else
        //return user(remove password

        User userSelected=userDao.selectUserByAccount(user.getUserName());

        if (userSelected==null)
            return ResponseResult.failed("用户不存在");
        else if (!passwordEncoder.matches(user.getPassword(),userSelected.getPassword()))
            return ResponseResult.failed("密码错误");
        else {
            //todo duplicate user content to loginUser?
            User loginUser=new User();
            loginUser.setUserName(user.getUserName());
            return ResponseResult.success(loginUser);
        }

    }

    @Override
    public User getUserByName(String userName) {
        return userDao.selectUserByAccount(userName);
    }
}
