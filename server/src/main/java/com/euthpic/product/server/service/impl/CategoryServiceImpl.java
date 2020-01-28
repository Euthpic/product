package com.euthpic.product.server.service.impl;

import com.euthpic.product.server.model.ProductCategory;
import com.euthpic.product.server.dao.ProductCategoryDao;
import com.euthpic.product.server.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    private final ProductCategoryDao productCategoryDao;

    public CategoryServiceImpl(ProductCategoryDao productCategoryDao) {
        this.productCategoryDao = productCategoryDao;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findByCategoryTypeIn(categoryTypeList);
    }
}
