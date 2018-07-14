package com.itao.manager.service;

import com.itao.manager.dal.ItaoItemDO;

public interface ItemService {

    ItaoItemDO getItemById(long itemId);
}
