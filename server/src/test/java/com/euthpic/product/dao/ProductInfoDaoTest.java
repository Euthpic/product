package com.euthpic.product.dao;

import com.euthpic.product.common.ProductInfoOutput;
import com.euthpic.product.server.dao.ProductInfoDao;
import com.euthpic.product.server.model.ProductInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
class ProductInfoDaoTest {
    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    void findByProductStatus() {
     List<ProductInfo> productInfoList= productInfoDao.findByProductStatus(1);
    }

    @Test
    void findByProductIdIn() {
    }
}