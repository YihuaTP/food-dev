package com.summer.mapper;


//import com.summer.dto.CategoryDTO;
//import com.summer.dto.NewItemsDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface CategoryMapperCustom {

    //根基一级分类ID，查询该一级分类下的分类
//    List<CategoryDTO> getSubCatList(Integer rootCatId);

    //查询一级分类下的，按创建时间排序的，前六条商品概要信息
//    List<NewItemsDTO> getSixNewItemsLazy(@Param("paramsMap") Map<String, Object> map);

}