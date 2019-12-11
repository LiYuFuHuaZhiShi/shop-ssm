package com.xpf.dao;

import com.xpf.entity.Brand;

public interface BrandMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}