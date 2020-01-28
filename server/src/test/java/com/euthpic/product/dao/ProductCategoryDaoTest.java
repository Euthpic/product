package com.euthpic.product.dao;

import com.euthpic.product.server.dao.ProductCategoryDao;
import com.euthpic.product.server.model.ProductCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    void findByCategoryTypeIn() {
        List<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(22);
        List<ProductCategory> categoryList=productCategoryDao.findByCategoryTypeIn(list);
        System.out.println(categoryList.toString());
    }
}