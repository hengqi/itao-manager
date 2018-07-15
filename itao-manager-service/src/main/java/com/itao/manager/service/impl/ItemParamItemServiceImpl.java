package com.itao.manager.service.impl;

import com.itao.manager.dal.ItaoItemParamItemDO;
import com.itao.manager.dal.ItaoItemParamItemDOExample;
import com.itao.manager.mapper.ItaoItemParamItemDOMapper;
import com.itao.manager.service.ItemParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class ItemParamItemServiceImpl implements ItemParamItemService {

    @Autowired
    private ItaoItemParamItemDOMapper itaoItemParamItemDOMapper;


    @Override
    public String getItemParamByItemId(Long itemId) {
        //根据商品id查询规格参数
        ItaoItemParamItemDOExample example = new ItaoItemParamItemDOExample();
        ItaoItemParamItemDOExample.Criteria criteria = example.createCriteria();
        criteria.andItemIdEqualTo(itemId);
        List<ItaoItemParamItemDO> itaoItemParamItemDOS = itaoItemParamItemDOMapper.selectByExample(example);

        if (!CollectionUtils.isEmpty(itaoItemParamItemDOS)) {
            return itaoItemParamItemDOS.get(0).getParamData();
        }
        return null;
    }
}
