package com.euthpic.product.service.impl;

import com.euthpic.product.dao.ProductInfoDao;
import com.euthpic.product.enums.ProductStatusEnum;
import com.euthpic.product.model.ProductInfo;
import com.euthpic.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoDao productInfoDao;
    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
