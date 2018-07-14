package com.itao.manager.mapper;

import com.itao.manager.dal.ItaoContentCategoryDO;
import com.itao.manager.dal.ItaoContentCategoryDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItaoContentCategoryDOMapper {
    int countByExample(ItaoContentCategoryDOExample example);

    int deleteByExample(ItaoContentCategoryDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItaoContentCategoryDO record);

    int insertSelective(ItaoContentCategoryDO record);

    List<ItaoContentCategoryDO> selectByExample(ItaoContentCategoryDOExample example);

    ItaoContentCategoryDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItaoContentCategoryDO record, @Param("example") ItaoContentCategoryDOExample example);

    int updateByExample(@Param("record") ItaoContentCategoryDO record, @Param("example") ItaoContentCategoryDOExample example);

    int updateByPrimaryKeySelective(ItaoContentCategoryDO record);

    int updateByPrimaryKey(ItaoContentCategoryDO record);
}