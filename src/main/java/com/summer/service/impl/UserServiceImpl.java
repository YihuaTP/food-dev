package com.summer.service.impl;

import com.summer.Enum.SexEnum;
import com.summer.bo.UserBO;
import com.summer.mapper.UsersMapper;
import com.summer.model.Users;
import com.summer.service.UserService;
import com.summer.utils.DateUtil;
import com.summer.utils.Md5Util;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;


@Service
public class UserServiceImpl implements UserService {

    @Value("${info.default_face}")
    private String defaultFace;

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private Sid sid;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean queryUserNameIsExit(String userName) {

        // example：条件查询
        // 组织一个Users对象
        Example userExample = new Example(Users.class);

        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("username", userName);

        Users result = usersMapper.selectOneByExample(userExample);

        return result == null ? false : true;

    }


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Users register(UserBO userBO) {

        Users user = new Users();

        // 创建一个唯一主键
        user.setId(sid.nextShort());

        user.setUsername(userBO.getUserName());

        try {
            user.setPassword(Md5Util.getMD5Str(userBO.getPassword()));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // 默认用户昵称同用户名
        user.setNickname(userBO.getUserName());

        // 默认头像
        user.setFace(defaultFace);

        // 默认生日
        user.setBirthday(DateUtil.stringToDate("1900-01-01"));

        // 默认性别为 保密
        user.setSex(SexEnum.SECRET.getSexType());

        user.setCreatedTime(new Date());

        user.setUpdatedTime(new Date());

        // 插入当前的用户信息，即注册成功
        usersMapper.insert(user);

        //需要在页面里面显示用的基本信息
        return user;
    }
}
