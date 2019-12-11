package com.xpf.service.impl;

import com.xpf.dao.ProDetailMapper;
import com.xpf.dao.ProductMapper;
import com.xpf.entity.ProDetail;
import com.xpf.entity.Product;
import com.xpf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProDetailMapper proDetailMapper;

    /**
     *从数据库中获得所有商品(SPU)
     * 用于商品列表的输出
     */
    @Override
    public List<Product> allProduct() {
        return productMapper.selectAllProduct();
    }

    /**
     *从数据库中获得所有具体的商品(SKU)
     * 用于商品详情页的输出
     */
    @Override
    public List<ProDetail> allProductDetail() {
        return proDetailMapper.selectAllPro();
    }


}
