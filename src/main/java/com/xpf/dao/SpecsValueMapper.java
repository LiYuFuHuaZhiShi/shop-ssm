package com.xpf.dao;

import com.xpf.entity.SpecsValue;

public interface SpecsValueMapper {
    int deleteByPrimaryKey(Integer svId);

    int insert(SpecsValue record);

    int insertSelective(SpecsValue record);

    SpecsValue selectByPrimaryKey(Integer svId);

    int updateByPrimaryKeySelective(SpecsValue record);

    int updateByPrimaryKey(SpecsValue record);
}