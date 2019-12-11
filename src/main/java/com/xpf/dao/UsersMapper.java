package com.xpf.dao;

import com.xpf.entity.Users;

import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    List<String> selectAllUsersName();

    Users findByName(String name);

    Users findUser(String name, String password);
}