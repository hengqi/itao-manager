package com.itao.manager.service;

import com.itao.common.result.EasyUIDataGridResult;
import com.itao.manager.dal.ItaoItemDO;

public interface ItemService {

    ItaoItemDO getItemById(long itemId);

    EasyUIDataGridResult getItemList(int page, int rows);
}
