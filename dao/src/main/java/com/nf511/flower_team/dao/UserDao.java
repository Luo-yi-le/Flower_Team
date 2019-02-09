package com.nf511.flower_team.dao;


import com.nf511.flower_team.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> selectAllUser();
    User userLogin(@Param("userName")String userName,@Param("userPassword")String userPassword);
    User selectUserId(@Param("userId") String userId);
    List<User>selectAllUserByPage(@Param("pagelimit")int pagelimit,@Param("size")int size);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(@Param("userId") int userId);
    int deleteAll(@Param("userIds") List<Integer>items);
}
