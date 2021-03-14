package com.summer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
public class Carousel {

    @Id
    private String id;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "background_color")
    private String backgroundColor;

    /* 商品id */
    @Column(name = "item_id")
    private String itemId;

   /* 商品分类id */
    @Column(name = "cat_id")
    private String catId;

   /* 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类 */
    private Integer type;

    /* 轮播图展示顺序 */
    private Integer sort;

    /* 是否展示 */
    @Column(name = "is_show")
    private Integer isShow;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}