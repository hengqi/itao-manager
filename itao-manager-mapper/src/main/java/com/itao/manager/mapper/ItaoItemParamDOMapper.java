package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoItemParamDO;
import com.itao.manager.dal.ItaoItemParamDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoItemParamDOMapper {
    int countByExample(ItaoItemParamDOExample example);

    int deleteByExample(ItaoItemParamDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItaoItemParamDO record);

    int insertSelective(ItaoItemParamDO record);

    List<ItaoItemParamDO> selectByExampleWithBLOBs(ItaoItemParamDOExample example);

    List<ItaoItemParamDO> selectByExample(ItaoItemParamDOExample example);

    ItaoItemParamDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItaoItemParamDO record, @Param("example") ItaoItemParamDOExample example);

    int updateByExampleWithBLOBs(@Param("record") ItaoItemParamDO record, @Param("example") ItaoItemParamDOExample example);

    int updateByExample(@Param("record") ItaoItemParamDO record, @Param("example") ItaoItemParamDOExample example);

    int updateByPrimaryKeySelective(ItaoItemParamDO record);

    int updateByPrimaryKeyWithBLOBs(ItaoItemParamDO record);

    int updateByPrimaryKey(ItaoItemParamDO record);
}