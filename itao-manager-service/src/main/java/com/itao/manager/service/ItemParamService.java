package com.itao.manager.service;

import com.itao.common.result.ITaoResult;
import com.itao.manager.dal.ItaoItemParamDO;

public interface ItemParamService {

    ITaoResult getItemParamByCid(Long cid);

    ITaoResult saveItemParam(ItaoItemParamDO itemParam);
}
