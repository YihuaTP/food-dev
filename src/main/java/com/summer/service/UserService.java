package com.summer.service;

import com.summer.bo.UserBO;
import com.summer.model.Users;


public interface UserService {

    // 判断用户名是否存在
    public boolean queryUserNameIsExit(String userName);

    // 注册用户
    public Users register(UserBO userBO);

}
