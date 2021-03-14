package com.summer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
public class Category {

    @Id
    private Integer id;


    private String name;

    /* 分类类型  "1"：代表1级分类 ，"2"代表2级分类 ，以此类推*/
    private Integer type;

    /* 父id */
    @Column(name = "father_id")
    private Integer fatherId;

    /* 图标 */
    private String logo;

    /* 口号 */
    private String slogan;

   /* 分类图 */
    @Column(name = "cat_image")
    private String catImage;

    /* 背景颜色 */
    @Column(name = "bg_color")
    private String bgColor;
}