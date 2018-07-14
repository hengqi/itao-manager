package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoOrderDO;
import com.itao.manager.dal.ItaoOrderDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoOrderDOMapper {
    int countByExample(ItaoOrderDOExample example);

    int deleteByExample(ItaoOrderDOExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(ItaoOrderDO record);

    int insertSelective(ItaoOrderDO record);

    List<ItaoOrderDO> selectByExample(ItaoOrderDOExample example);

    ItaoOrderDO selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") ItaoOrderDO record, @Param("example") ItaoOrderDOExample example);

    int updateByExample(@Param("record") ItaoOrderDO record, @Param("example") ItaoOrderDOExample example);

    int updateByPrimaryKeySelective(ItaoOrderDO record);

    int updateByPrimaryKey(ItaoOrderDO record);
}