package com.summer.mapper;

import com.summer.model.Orders;
import com.summer.my.mapper.MyMapper;
import org.springframework.stereotype.Repository;


@Repository
public interface OrdersMapper extends MyMapper<Orders> {
}