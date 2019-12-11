package com.xpf.dao;

import com.xpf.entity.ProSpecs;

public interface ProSpecsMapper {
    int deleteByPrimaryKey(Integer psId);

    int insert(ProSpecs record);

    int insertSelective(ProSpecs record);

    ProSpecs selectByPrimaryKey(Integer psId);

    int updateByPrimaryKeySelective(ProSpecs record);

    int updateByPrimaryKey(ProSpecs record);
}