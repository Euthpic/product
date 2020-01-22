package com.euthpic.product.dao;

import com.euthpic.product.model.ProductInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class ProductInfoDaoTest {
    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    void findByProductStatus() {
     List<ProductInfo> productInfoList= productInfoDao.findByProductStatus(1);
        System.out.println(productInfoList.size());
    }
}