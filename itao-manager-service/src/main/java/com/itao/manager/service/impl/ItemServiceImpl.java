package com.itao.manager.service.impl;

import com.itao.manager.dal.ItaoItemDO;
import com.itao.manager.mapper.ItaoItemDOMapper;
import com.itao.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItaoItemDOMapper itaoItemDOMapper;

    @Override
    public ItaoItemDO getItemById(long itemId) {
        ItaoItemDO itaoItemDO = itaoItemDOMapper.selectByPrimaryKey(itemId);
        return itaoItemDO;
    }
}
