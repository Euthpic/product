package com.euthpic.product.service;

import com.euthpic.product.common.DecreaseStockInput;
import com.euthpic.product.server.model.ProductInfo;
import com.euthpic.product.server.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

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
        DecreaseStockInput cartDto=new DecreaseStockInput("157875196366160022",2);
        productService.decreaseStock(Collections.singletonList(cartDto));
    }

}