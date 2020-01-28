package com.euthpic.product.server.service;

import com.euthpic.product.common.DecreaseStockInput;
import com.euthpic.product.common.ProductInfoOutput;
import com.euthpic.product.server.dto.CartDto;
import com.euthpic.product.server.model.ProductInfo;

import java.util.List;

public interface ProductService {
    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     */
    void decreaseStock(List<DecreaseStockInput> cartDtoList);

}
