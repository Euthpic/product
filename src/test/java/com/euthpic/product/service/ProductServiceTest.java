package com.euthpic.product.service;

import com.euthpic.product.model.ProductInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductServiceTest {
@Autowired
private ProductService productService;
    @Test
    void findUpAll() {
      List<ProductInfo> list= productService.findUpAll();
        System.out.println(list.toString());
    }
}