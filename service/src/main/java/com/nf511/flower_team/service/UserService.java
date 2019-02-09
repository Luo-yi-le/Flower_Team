package com.nf511.flower_team.service;


import com.nf511.flower_team.entity.User;
import org.apache.ibatis.annotations.Param;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> selectAllUser();
    User userLogin(String userName,String userPassword);
}
