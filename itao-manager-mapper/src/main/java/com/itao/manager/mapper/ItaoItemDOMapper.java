package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoItemDO;
import com.itao.manager.dal.ItaoItemDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoItemDOMapper {
    int countByExample(ItaoItemDOExample example);

    int deleteByExample(ItaoItemDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItaoItemDO record);

    int insertSelective(ItaoItemDO record);

    List<ItaoItemDO> selectByExample(ItaoItemDOExample example);

    ItaoItemDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItaoItemDO record, @Param("example") ItaoItemDOExample example);

    int updateByExample(@Param("record") ItaoItemDO record, @Param("example") ItaoItemDOExample example);

    int updateByPrimaryKeySelective(ItaoItemDO record);

    int updateByPrimaryKey(ItaoItemDO record);
}