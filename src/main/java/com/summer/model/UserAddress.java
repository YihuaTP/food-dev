package com.summer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
public class UserAddress {

    @Id
    private String id;

    /* 关联用户id */
    @Column(name = "user_id")
    private String userId;

    /* 收件人姓名 */
    private String receiver;

    private String mobile;

    /* 省份 */
    private String province;

    private String city;

    /* 区县 */
    private String district;

    /* 详细地址 */
    private String detail;

    /* 扩展字段 */
    private String extand;

    /* 是否默认地址 */
    @Column(name = "is_default")
    private Integer isDefault;

    /* 创建时间 */
    @Column(name = "created_time")
    private Date createdTime;

    /* 更新时间 */
    @Column(name = "updated_time")
    private Date updatedTime;

}