package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoItemDescDO;
import com.itao.manager.dal.ItaoItemDescDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoItemDescDOMapper {
    int countByExample(ItaoItemDescDOExample example);

    int deleteByExample(ItaoItemDescDOExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(ItaoItemDescDO record);

    int insertSelective(ItaoItemDescDO record);

    List<ItaoItemDescDO> selectByExampleWithBLOBs(ItaoItemDescDOExample example);

    List<ItaoItemDescDO> selectByExample(ItaoItemDescDOExample example);

    ItaoItemDescDO selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") ItaoItemDescDO record, @Param("example") ItaoItemDescDOExample example);

    int updateByExampleWithBLOBs(@Param("record") ItaoItemDescDO record, @Param("example") ItaoItemDescDOExample example);

    int updateByExample(@Param("record") ItaoItemDescDO record, @Param("example") ItaoItemDescDOExample example);

    int updateByPrimaryKeySelective(ItaoItemDescDO record);

    int updateByPrimaryKeyWithBLOBs(ItaoItemDescDO record);

    int updateByPrimaryKey(ItaoItemDescDO record);
}