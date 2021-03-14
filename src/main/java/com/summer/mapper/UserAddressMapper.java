package com.summer.mapper;

import com.summer.model.UserAddress;
import com.summer.my.mapper.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressMapper extends MyMapper<UserAddress> {
}