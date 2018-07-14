package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoOrderItemDO;
import com.itao.manager.dal.ItaoOrderItemDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoOrderItemDOMapper {
    int countByExample(ItaoOrderItemDOExample example);

    int deleteByExample(ItaoOrderItemDOExample example);

    int deleteByPrimaryKey(String id);

    int insert(ItaoOrderItemDO record);

    int insertSelective(ItaoOrderItemDO record);

    List<ItaoOrderItemDO> selectByExample(ItaoOrderItemDOExample example);

    ItaoOrderItemDO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItaoOrderItemDO record, @Param("example") ItaoOrderItemDOExample example);

    int updateByExample(@Param("record") ItaoOrderItemDO record, @Param("example") ItaoOrderItemDOExample example);

    int updateByPrimaryKeySelective(ItaoOrderItemDO record);

    int updateByPrimaryKey(ItaoOrderItemDO record);
}