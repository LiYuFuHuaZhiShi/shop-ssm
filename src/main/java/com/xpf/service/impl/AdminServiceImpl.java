package com.xpf.service.impl;

import com.xpf.dao.AdminMapper;
import com.xpf.entity.Admin;
import com.xpf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    /**
     *管理员登录
     */
    @Override
    public Admin adminLogin(String username, String password) {
        //根据用户名查询此用户
        Admin admin = adminMapper.findAdmin(username,password);
        if (admin != null){
            return admin;
        }else {
            return null;
        }
    }
}
