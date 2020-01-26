package com.euthpic.product.service.impl;

import com.euthpic.product.dao.ProductCategoryDao;
import com.euthpic.product.model.ProductCategory;
import com.euthpic.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
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
