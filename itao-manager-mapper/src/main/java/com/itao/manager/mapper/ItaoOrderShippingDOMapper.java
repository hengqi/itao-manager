package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoOrderShippingDO;
import com.itao.manager.dal.ItaoOrderShippingDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoOrderShippingDOMapper {
    int countByExample(ItaoOrderShippingDOExample example);

    int deleteByExample(ItaoOrderShippingDOExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(ItaoOrderShippingDO record);

    int insertSelective(ItaoOrderShippingDO record);

    List<ItaoOrderShippingDO> selectByExample(ItaoOrderShippingDOExample example);

    ItaoOrderShippingDO selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") ItaoOrderShippingDO record, @Param("example") ItaoOrderShippingDOExample example);

    int updateByExample(@Param("record") ItaoOrderShippingDO record, @Param("example") ItaoOrderShippingDOExample example);

    int updateByPrimaryKeySelective(ItaoOrderShippingDO record);

    int updateByPrimaryKey(ItaoOrderShippingDO record);
}