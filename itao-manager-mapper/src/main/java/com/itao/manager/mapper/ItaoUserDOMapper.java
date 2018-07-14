package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoUserDO;
import com.itao.manager.dal.ItaoUserDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoUserDOMapper {
    int countByExample(ItaoUserDOExample example);

    int deleteByExample(ItaoUserDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItaoUserDO record);

    int insertSelective(ItaoUserDO record);

    List<ItaoUserDO> selectByExample(ItaoUserDOExample example);

    ItaoUserDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItaoUserDO record, @Param("example") ItaoUserDOExample example);

    int updateByExample(@Param("record") ItaoUserDO record, @Param("example") ItaoUserDOExample example);

    int updateByPrimaryKeySelective(ItaoUserDO record);

    int updateByPrimaryKey(ItaoUserDO record);
}