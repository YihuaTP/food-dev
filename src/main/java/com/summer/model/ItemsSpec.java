package com.summer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 商品规格表
 */
@Getter
@Setter
public class ItemsSpec {

    /* 商品规格id */
    @Id
    private String id;

    /* 商品外键id */
    @Column(name = "item_id")
    private String itemId;

    private String name;

    /* 库存 */
    private Integer stock;

    /* 折扣力度 */
    private BigDecimal discounts;

    /* 优惠价 */
    @Column(name = "price_discount")
    private Integer priceDiscount;

    /* 原价 */
    @Column(name = "price_normal")
    private Integer priceNormal;

    /* 创建时间 */
    @Column(name = "created_time")
    private Date createdTime;

    /* 更新时间 */
    @Column(name = "updated_time")
    private Date updatedTime;

}