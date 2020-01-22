package com.euthpic.product.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * user_info
 * @author 
 */
@Data
@Entity
public class UserInfo implements Serializable {
    @Id
    private String id;

    private String username;

    private String password;

    /**
     * 微信openid
     */
    private String openid;

    /**
     * 1买家2卖家
     */
    private Boolean role;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}