package com.summer.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
public class Users {

    @Id
    private String id;

    private String username;

    private String password;

    private String nickname;

    /* 真实姓名 */
    private String realname;

    /* 头像 */
    private String face;

    private String mobile;

    private String email;

    /* 性别 性别 1:男  0:女  2:保密*/
    private Integer sex;

    private Date birthday;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;


}