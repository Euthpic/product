package com.euthpic.product.dao;

import com.euthpic.product.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDao extends JpaRepository<OrderDetail,String> {

}