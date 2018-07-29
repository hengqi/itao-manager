package com.itao.manager.service;

import com.itao.common.result.EasyUIDataGridResult;
import com.itao.common.result.ITaoResult;
import com.itao.manager.dal.ItaoContentDO;

public interface ContentService {

    ITaoResult insertContent(ItaoContentDO content);

    EasyUIDataGridResult getItemList(Long categoryId, Integer page, Integer rows);
}
