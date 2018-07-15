package com.itao.manager.service.impl;

import com.itao.common.result.ITaoResult;
import com.itao.manager.dal.ItaoItemParamDO;
import com.itao.manager.dal.ItaoItemParamDOExample;
import com.itao.manager.mapper.ItaoItemParamDOMapper;
import com.itao.manager.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

@Service
public class ItemParamServiceImpl implements ItemParamService {

    @Autowired
    private ItaoItemParamDOMapper itaoItemParamDOMapper;

    @Override
    public ITaoResult getItemParamByCid(Long cid) {
        ItaoItemParamDOExample example = new ItaoItemParamDOExample();
        example.createCriteria().andItemCatIdEqualTo(cid);
        List<ItaoItemParamDO> list = itaoItemParamDOMapper.selectByExampleWithBLOBs(example);
        if(!CollectionUtils.isEmpty(list)) {
            return ITaoResult.ok(list.get(0));
        }
        return ITaoResult.ok();
    }

    @Override
    public ITaoResult saveItemParam(ItaoItemParamDO itemParam) {
        itemParam.setCreated(new Date());
        itemParam.setUpdated(new Date());
        itaoItemParamDOMapper.insert(itemParam);
        return ITaoResult.ok();
    }
}
