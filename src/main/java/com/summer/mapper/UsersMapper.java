package com.summer.mapper;

import com.summer.model.Users;
import com.summer.my.mapper.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper extends MyMapper<Users> {
}