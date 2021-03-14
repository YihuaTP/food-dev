package com.summer.mapper;

import com.summer.model.OrderItems;
import com.summer.my.mapper.MyMapper;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemsMapper extends MyMapper<OrderItems> {
}