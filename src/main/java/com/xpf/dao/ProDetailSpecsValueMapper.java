package com.xpf.dao;

import com.xpf.entity.ProDetailSpecsValue;

public interface ProDetailSpecsValueMapper {
    int deleteByPrimaryKey(Integer pdsvId);

    int insert(ProDetailSpecsValue record);

    int insertSelective(ProDetailSpecsValue record);

    ProDetailSpecsValue selectByPrimaryKey(Integer pdsvId);

    int updateByPrimaryKeySelective(ProDetailSpecsValue record);

    int updateByPrimaryKey(ProDetailSpecsValue record);
}