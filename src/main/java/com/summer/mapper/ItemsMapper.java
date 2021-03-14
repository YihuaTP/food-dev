package com.summer.mapper;

import com.summer.model.Items;
import com.summer.my.mapper.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsMapper extends MyMapper<Items> {
}