package com.xjtu.se.homework.admin.dao;

import com.xjtu.se.homework.admin.home.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminDao {
    List<Admin> getAdmin();
}
