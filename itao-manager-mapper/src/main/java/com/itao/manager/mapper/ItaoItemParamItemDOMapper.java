package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoItemParamItemDO;
import com.itao.manager.dal.ItaoItemParamItemDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoItemParamItemDOMapper {
    int countByExample(ItaoItemParamItemDOExample example);

    int deleteByExample(ItaoItemParamItemDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItaoItemParamItemDO record);

    int insertSelective(ItaoItemParamItemDO record);

    List<ItaoItemParamItemDO> selectByExampleWithBLOBs(ItaoItemParamItemDOExample example);

    List<ItaoItemParamItemDO> selectByExample(ItaoItemParamItemDOExample example);

    ItaoItemParamItemDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItaoItemParamItemDO record, @Param("example") ItaoItemParamItemDOExample example);

    int updateByExampleWithBLOBs(@Param("record") ItaoItemParamItemDO record, @Param("example") ItaoItemParamItemDOExample example);

    int updateByExample(@Param("record") ItaoItemParamItemDO record, @Param("example") ItaoItemParamItemDOExample example);

    int updateByPrimaryKeySelective(ItaoItemParamItemDO record);

    int updateByPrimaryKeyWithBLOBs(ItaoItemParamItemDO record);

    int updateByPrimaryKey(ItaoItemParamItemDO record);
}