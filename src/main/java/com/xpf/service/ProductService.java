package com.xpf.service;

import com.xpf.entity.ProDetail;
import com.xpf.entity.Product;

import java.util.List;

public interface ProductService {
    /**
     *从数据库中获得所有商品(SPU)
     * 用于商品列表的输出
     */
    List<Product> allProduct();

    /**
     *从数据库中获得所有具体的商品(SKU)
     * 用于商品详情页的输出
     */
    List<ProDetail> allProductDetail();
}
