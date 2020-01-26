package com.euthpic.product.service.impl;

import com.euthpic.product.dao.ProductInfoDao;
import com.euthpic.product.enums.ProductStatusEnum;
import com.euthpic.product.model.ProductInfo;
import com.euthpic.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductInfoDao productInfoDao;

    public ProductServiceImpl(ProductInfoDao productInfoDao) {
        this.productInfoDao = productInfoDao;
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
