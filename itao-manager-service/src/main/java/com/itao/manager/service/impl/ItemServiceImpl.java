package com.itao.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itao.common.result.EasyUIDataGridResult;
import com.itao.common.result.ITaoResult;
import com.itao.common.utils.IDUtils;
import com.itao.manager.dal.ItaoItemDO;
import com.itao.manager.dal.ItaoItemDOExample;
import com.itao.manager.dal.ItaoItemDescDO;
import com.itao.manager.dal.ItaoItemParamItemDO;
import com.itao.manager.mapper.ItaoItemDOMapper;
import com.itao.manager.mapper.ItaoItemDescDOMapper;
import com.itao.manager.mapper.ItaoItemParamItemDOMapper;
import com.itao.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItaoItemDOMapper itaoItemDOMapper;

    @Autowired
    private ItaoItemDescDOMapper itaoItemDescDOMapper;

    @Autowired
    private ItaoItemParamItemDOMapper itaoItemParamItemDOMapper;

    @Override
    public ItaoItemDO getItemById(long itemId) {
        ItaoItemDO itaoItemDO = itaoItemDOMapper.selectByPrimaryKey(itemId);
        return itaoItemDO;
    }

    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        // 查询商品列表
        ItaoItemDOExample example = new ItaoItemDOExample();
        // 分页处理
        PageHelper.startPage(page, rows);
        List<ItaoItemDO> list = itaoItemDOMapper.selectByExample(example);
        // 创建一个返回值对象
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setRows(list);
        // 取记录总条数
        PageInfo<ItaoItemDO> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    @Override
    public ITaoResult createItem(ItaoItemDO item, String desc, String itemParams) throws Exception {
        Long itemId = IDUtils.genItemId();
        item.setId(itemId);//生成商品id
        item.setStatus((byte) 1);//商品的状态：1：正常，2：下架，3：删除
        item.setCreated(new Date());
        item.setUpdated(new Date());
        itaoItemDOMapper.insert(item);
        //添加商品描述信息
        ITaoResult result = insertItemDesc(itemId, desc);
        if (result.getStatus() != 200) {
            throw new Exception();
        }
        //添加商品规格参数
//        result = insertItemParamItem(itemId, itemParams);
//        if (result.getStatus() != 200) {
//            throw new Exception();
//        }

        return ITaoResult.ok();
    }

    private ITaoResult insertItemDesc(Long itemId, String desc) {
        ItaoItemDescDO itemDesc = new ItaoItemDescDO();
        itemDesc.setItemId(itemId);
        itemDesc.setItemDesc(desc);
        itemDesc.setCreated(new Date());
        itemDesc.setUpdated(new Date());
        itaoItemDescDOMapper.insert(itemDesc);
        return ITaoResult.ok();
    }

    private ITaoResult insertItemParamItem(Long itemId, String itemParams) {
        ItaoItemParamItemDO itemParamItem = new ItaoItemParamItemDO();
        itemParamItem.setItemId(itemId);
        itemParamItem.setParamData(itemParams);
        itemParamItem.setCreated(new Date());
        itemParamItem.setUpdated(new Date());
        itaoItemParamItemDOMapper.insert(itemParamItem);
        return ITaoResult.ok();
    }
}
