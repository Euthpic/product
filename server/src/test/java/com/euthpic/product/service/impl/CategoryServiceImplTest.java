package com.euthpic.product.service.impl;

import com.euthpic.product.server.model.ProductCategory;
import com.euthpic.product.server.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CategoryServiceImplTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    void findByCategoryTypeIn() {
        List<ProductCategory> list= categoryService.findByCategoryTypeIn(Arrays.asList(11));
        System.out.println(list.toString());
    }
}