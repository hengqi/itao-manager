package com.itao.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itao.common.result.EasyUIDataGridResult;
import com.itao.manager.dal.ItaoItemDO;
import com.itao.manager.dal.ItaoItemDOExample;
import com.itao.manager.mapper.ItaoItemDOMapper;
import com.itao.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItaoItemDOMapper itaoItemDOMapper;

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
}
