package com.xjtu.se.homework.admin.home.impl;

import com.xjtu.se.homework.admin.dao.AdminDao;
import com.xjtu.se.homework.admin.home.Admin;
import com.xjtu.se.homework.admin.home.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;

    @Override
    public List<Admin> getAdmin() {
        return adminDao.getAdmin();
    }
}
