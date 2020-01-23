package com.euthpic.product.service;

import com.euthpic.product.model.ProductCategory;

import java.util.List;

/**
 * 类目
 */
public interface CategoryService {
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
