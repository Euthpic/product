package com.euthpic.product.dao;

import com.euthpic.product.model.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterDao extends JpaRepository<OrderMaster,String> {

}