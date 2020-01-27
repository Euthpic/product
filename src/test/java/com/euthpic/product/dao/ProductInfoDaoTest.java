package com.euthpic.product.dao;

import com.euthpic.product.model.ProductInfo;
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
        List<ProductInfo> productInfoList= productInfoDao.findByProductIdIn(
                Arrays.asList("157875196366160022","157875227953464068"));
        System.out.println(productInfoList.toString());
    }
}