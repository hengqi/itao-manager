package com.itao.manager.service.impl;

import com.itao.common.result.EasyUITreeNode;
import com.itao.manager.dal.ItaoItemCatDO;
import com.itao.manager.dal.ItaoItemCatDOExample;
import com.itao.manager.mapper.ItaoItemCatDOMapper;
import com.itao.manager.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Autowired
    private ItaoItemCatDOMapper itaoItemCatDOMapper;

    @Override
    public List<EasyUITreeNode> getItemCatList(Long parentId) throws Exception {

        ItaoItemCatDOExample example = new ItaoItemCatDOExample();
        //设置查询条件
        ItaoItemCatDOExample.Criteria criteria = example.createCriteria();
        //根据parentid查询子节点
        criteria.andParentIdEqualTo(parentId);
        //返回子节点列表
        List<ItaoItemCatDO> list = itaoItemCatDOMapper.selectByExample(example);
        List<EasyUITreeNode> catList = new ArrayList<>();

        list.forEach(item -> {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(item.getId());
            node.setText(item.getName());
            node.setState(item.getIsParent()?"closed":"open");
            catList.add(node);
        });
        return catList;
    }
}
