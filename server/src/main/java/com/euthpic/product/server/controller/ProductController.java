package com.euthpic.product.server.controller;

import com.euthpic.product.common.DecreaseStockInput;
import com.euthpic.product.common.ProductInfoOutput;
import com.euthpic.product.server.dto.CartDto;
import com.euthpic.product.server.model.ProductCategory;
import com.euthpic.product.server.model.ProductInfo;
import com.euthpic.product.server.service.CategoryService;
import com.euthpic.product.server.service.ProductService;
import com.euthpic.product.server.utils.ResultVoUtil;
import com.euthpic.product.server.vo.ProductInfoVo;
import com.euthpic.product.server.vo.ProductVo;
import com.euthpic.product.server.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final CategoryService categoryService;
    private final ProductService productService;

    public ProductController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    /**
     * 1. 查询所有上架商品
     * 2. 获取类目type列表
     * 3. 查询类目
     * 4. 构造数据
     */
    @GetMapping("/list")
    public ResultVo<ProductVo> list() {
        //1. 查询所有上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //2. 获取类目type列表
        List<Integer> categoryTypeList = productInfoList.stream().
                map(ProductInfo::getCategoryType).
                collect(Collectors.toList());
        //3. 查询类目
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        //4. 构造数据
        List<ProductVo> productVos = new ArrayList<>();
        for (ProductCategory productCategory : categoryList) {
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVo> productInfoVos = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo, productInfoVo);
                    productInfoVos.add(productInfoVo);
                }

            }
            productVo.setProductInfoVoList(productInfoVos);
            productVos.add(productVo);
        }

        return ResultVoUtil.success(productVos);
    }

    @PostMapping("/listForOrder")
    public List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList) {
        return productService.findList(productIdList);
    }

    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<DecreaseStockInput> cartDtoList) {
       productService.decreaseStock(cartDtoList);
    }
}
