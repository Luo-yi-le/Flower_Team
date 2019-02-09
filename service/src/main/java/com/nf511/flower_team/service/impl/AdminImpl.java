package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.AdminDao;
import com.nf511.flower_team.entity.Admin;
import com.nf511.flower_team.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminImpl implements AdminService {
    @Autowired
    AdminDao adminDao;

    public List<Admin> selectAllAdmin() {
        return adminDao.selectAllAdmin();
    }

    public Admin selectAllAdminId(String adminId) {
        return adminDao.selectAllAdminId(adminId);
    }

    public List<Admin> selectAllAdminByPage(int pagelimit, int size) {
        return adminDao.selectAllAdminByPage(pagelimit, size);
    }

    public int insertAdmin(Admin admin) {
        return adminDao.insertAdmin(admin);
    }

    public int updateAdmin(Admin admin) {
        return adminDao.updateAdmin(admin);
    }

    public int deleteAdmin(int adminId) {
        return adminDao.deleteAdmin(adminId);
    }

    public int deleteAll(List<Integer> items) {
        return adminDao.deleteAll(items);
    }
}
