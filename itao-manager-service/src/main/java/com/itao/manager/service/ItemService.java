package com.itao.manager.service;

import com.itao.common.result.EasyUIDataGridResult;
import com.itao.common.result.ITaoResult;
import com.itao.manager.dal.ItaoItemDO;

public interface ItemService {

    ItaoItemDO getItemById(long itemId);

    EasyUIDataGridResult getItemList(int page, int rows);

    ITaoResult createItem(ItaoItemDO item, String desc, String itemParams) throws Exception;
}
