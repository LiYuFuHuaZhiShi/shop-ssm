package com.xpf.dao;

import com.xpf.entity.ProDetail;

public interface ProDetailMapper {
    int deleteByPrimaryKey(Integer pdId);

    int insert(ProDetail record);

    int insertSelective(ProDetail record);

    ProDetail selectByPrimaryKey(Integer pdId);

    int updateByPrimaryKeySelective(ProDetail record);

    int updateByPrimaryKey(ProDetail record);
}