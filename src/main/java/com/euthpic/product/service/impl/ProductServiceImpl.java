package com.euthpic.product.service.impl;

import com.euthpic.product.dao.ProductInfoDao;
import com.euthpic.product.dto.CartDto;
import com.euthpic.product.enums.ProductStatusEnum;
import com.euthpic.product.enums.ResultEnum;
import com.euthpic.product.exception.ProductException;
import com.euthpic.product.model.ProductInfo;
import com.euthpic.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductInfoDao productInfoDao;

    public ProductServiceImpl(ProductInfoDao productInfoDao) {
        this.productInfoDao = productInfoDao;
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public List<ProductInfo> findList(List<String> productIdList) {
        return productInfoDao.findByProductIdIn(productIdList);
    }

    @Override
    public void decreaseStock(List<CartDto> cartDtoList) {
        for (CartDto cartDto : cartDtoList) {
            Optional<ProductInfo> productInfoOptional = productInfoDao.findById(cartDto.getProductId());
            //判断商品是否存在
            if (!productInfoOptional.isPresent()) {
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            ProductInfo productInfo=productInfoOptional.get();
            //库存是否足够
          int result = productInfo.getProductStock()-cartDto.getProductQuantity();
            if (result < 0) {
                throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            //扣减库存并保存
            productInfo.setProductStock(result);
            productInfoDao.save(productInfo);
        }
    }

}
