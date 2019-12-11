package com.xpf.dao;

import com.xpf.entity.OrderItem;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer oiId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer oiId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}