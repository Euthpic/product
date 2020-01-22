package com.euthpic.product.dao;

import com.euthpic.product.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoDao extends JpaRepository<UserInfo,String> {

}