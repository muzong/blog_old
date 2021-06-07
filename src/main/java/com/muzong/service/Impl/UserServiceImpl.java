package com.muzong.service.Impl;


import com.muzong.dao.UserDao;
import com.muzong.entity.User;
import com.muzong.service.UserService;
import com.muzong.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}