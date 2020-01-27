package com.euthpic.product.service;

import com.euthpic.product.dto.CartDto;
import com.euthpic.product.model.ProductInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
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
    @Test
    void decreaseStock() {
        CartDto cartDto=new CartDto("157875196366160022",2);
        productService.decreaseStock(Collections.singletonList(cartDto));
    }

}