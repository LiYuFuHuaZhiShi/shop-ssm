package com.xpf.dao;

import com.xpf.entity.Specifications;

public interface SpecificationsMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Specifications record);

    int insertSelective(Specifications record);

    Specifications selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Specifications record);

    int updateByPrimaryKey(Specifications record);
}