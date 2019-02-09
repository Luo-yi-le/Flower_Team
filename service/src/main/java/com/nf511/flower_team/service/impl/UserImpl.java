package com.nf511.flower_team.service.impl;


import com.nf511.flower_team.dao.UserDao;
import com.nf511.flower_team.entity.User;
import com.nf511.flower_team.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

@Service
public class UserImpl implements UserService{

    @Autowired
    UserDao userDao;

    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }
    public User userLogin(String userName,String userPassword){
        return userDao.userLogin(userName,userPassword);
    }

    public User selectUserId(String userId) {
        return userDao.selectUserId(userId);
    }

    public List<User> selectAllUserByPage(int pagelimit, int size) {
        return userDao.selectAllUserByPage(pagelimit,size);
    }

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int deleteUser(int userId) {
        return userDao.deleteUser(userId);
    }

    public int deleteAll(List<Integer> items) {
        return userDao.deleteAll(items);
    }
}
