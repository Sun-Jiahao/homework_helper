package com.xjtu.se.homework.admin.home;

import com.xjtu.se.homework.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/home")
public class AdminHomeAPI {
    @Resource
    private AdminService adminService;

    @GetMapping("/get")
    public Result getAdmin (){
        return Result.success(adminService.getAdmin());
    }
}
