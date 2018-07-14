package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoContentDO;
import com.itao.manager.dal.ItaoContentDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoContentDOMapper {
    int countByExample(ItaoContentDOExample example);

    int deleteByExample(ItaoContentDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItaoContentDO record);

    int insertSelective(ItaoContentDO record);

    List<ItaoContentDO> selectByExampleWithBLOBs(ItaoContentDOExample example);

    List<ItaoContentDO> selectByExample(ItaoContentDOExample example);

    ItaoContentDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItaoContentDO record, @Param("example") ItaoContentDOExample example);

    int updateByExampleWithBLOBs(@Param("record") ItaoContentDO record, @Param("example") ItaoContentDOExample example);

    int updateByExample(@Param("record") ItaoContentDO record, @Param("example") ItaoContentDOExample example);

    int updateByPrimaryKeySelective(ItaoContentDO record);

    int updateByPrimaryKeyWithBLOBs(ItaoContentDO record);

    int updateByPrimaryKey(ItaoContentDO record);
}