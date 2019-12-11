package com.xpf.dao;

import com.xpf.entity.Mycart;

public interface MycartMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Mycart record);

    int insertSelective(Mycart record);

    Mycart selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Mycart record);

    int updateByPrimaryKey(Mycart record);
}