package com.euthpic.product.server.service;

import com.euthpic.product.server.model.ProductCategory;

import java.util.List;

/**
 * 类目
 */
public interface CategoryService {
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
