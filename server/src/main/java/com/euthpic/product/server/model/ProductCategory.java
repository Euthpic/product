package com.euthpic.product.server.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * product_category
 * @author 
 */
@Data
@Entity
public class ProductCategory implements Serializable {
   @Id
   @GeneratedValue
    private Integer categoryId;

    /**
     * 类目名字
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;

    /**
     * 创建时间
     */
//    private Date createTime;
//
//    /**
//     * 修改时间
//     */
//    private Date updateTime;

    private static final long serialVersionUID = 1L;
}