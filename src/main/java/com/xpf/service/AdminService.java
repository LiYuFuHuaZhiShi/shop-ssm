package com.xpf.service;

import com.xpf.entity.Admin;
import com.xpf.entity.Users;

public interface AdminService {

    /**
     *管理员登录
     */
    Admin adminLogin(String username, String password);

}
