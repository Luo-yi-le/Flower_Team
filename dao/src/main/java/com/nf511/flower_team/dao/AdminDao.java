package com.nf511.flower_team.dao;

import com.nf511.flower_team.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminDao {
    List<Admin> selectAllAdmin();
    Admin selectAllAdminId(@Param("adminId") String adminId);
    List<Admin>selectAllAdminByPage(@Param("pagelimit")int pagelimit,@Param("size")int size);
    int insertAdmin(Admin admin);
    int updateAdmin(Admin admin);
    int deleteAdmin(@Param("adminId") int adminId);
    int deleteAll(@Param("adminIds") List<Integer>items);
}
