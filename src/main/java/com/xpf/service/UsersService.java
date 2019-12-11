package com.xpf.service;

import com.xpf.entity.Users;

import java.util.List;

public interface UsersService {

    /**
     * 获取所有的用户名
     * @return 用户名集
     */
    List<String> getAllUsersName();

    /**
     *查询是否有此用户
     */
    Boolean checkUser(String name);

    /**
     *用户登录
     */
    Users userLogin(String name, String password);

    /**
     * 用户注册
     * @param users
     */
    Boolean addUsers(Users users);

}
