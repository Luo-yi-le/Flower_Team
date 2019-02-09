package com.nf511.flower_team.dao;


import com.nf511.flower_team.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> selectAllUser();
    User userLogin(@Param("userName")String userName,@Param("userPassword")String userPassword);
}
