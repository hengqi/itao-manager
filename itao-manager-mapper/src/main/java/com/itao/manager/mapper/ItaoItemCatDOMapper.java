package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoItemCatDO;
import com.itao.manager.dal.ItaoItemCatDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoItemCatDOMapper {
    int countByExample(ItaoItemCatDOExample example);

    int deleteByExample(ItaoItemCatDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItaoItemCatDO record);

    int insertSelective(ItaoItemCatDO record);

    List<ItaoItemCatDO> selectByExample(ItaoItemCatDOExample example);

    ItaoItemCatDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItaoItemCatDO record, @Param("example") ItaoItemCatDOExample example);

    int updateByExample(@Param("record") ItaoItemCatDO record, @Param("example") ItaoItemCatDOExample example);

    int updateByPrimaryKeySelective(ItaoItemCatDO record);

    int updateByPrimaryKey(ItaoItemCatDO record);
}