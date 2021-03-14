package com.summer.mapper;

//import com.summer.dto.ItemCommentDTO;
//import com.summer.dto.SearchItemsDTO;
//import com.summer.dto.ShopcartDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ItemsMapperCustom {

//    List<ItemCommentDTO> queryItemComments(@Param("paramsMap") Map<String, Object> map);
//
//    List<SearchItemsDTO> searchItems(@Param("paramsMap") Map<String, Object> map);
//
//    List<SearchItemsDTO> searchItemsByThirdCat(@Param("paramsMap") Map<String, Object> map);
//
//    List<ShopcartDTO> queryItemsBySpecIds(@Param("paramsList") List specIdsList);

    int decreaseItemSpecStock(@Param("specId") String specId, @Param("pendingCounts") int pendingCounts);

}