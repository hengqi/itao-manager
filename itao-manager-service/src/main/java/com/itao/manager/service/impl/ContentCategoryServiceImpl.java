package com.itao.manager.service.impl;

import com.itao.common.result.EasyUITreeNode;
import com.itao.common.result.ITaoResult;
import com.itao.manager.dal.ItaoContentCategoryDO;
import com.itao.manager.dal.ItaoContentCategoryDOExample;
import com.itao.manager.mapper.ItaoContentCategoryDOMapper;
import com.itao.manager.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

    @Autowired
    private ItaoContentCategoryDOMapper itaoContentCategoryDOMapper;

    @Override
    public List<EasyUITreeNode> getCategoryList(long parentId) {
        ItaoContentCategoryDOExample example = new ItaoContentCategoryDOExample();
        ItaoContentCategoryDOExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        // 执行查询
        List<ItaoContentCategoryDO> list = itaoContentCategoryDOMapper.selectByExample(example);
        List<EasyUITreeNode> resultList = new ArrayList<>();
        list.forEach(contentCategory -> {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(contentCategory.getId());
            node.setText(contentCategory.getName());
            node.setState(contentCategory.getIsParent() ? "closed" : "open");

            resultList.add(node);
        });
        return resultList;
    }

    @Override
    public ITaoResult insertContentCategory(Long parentId, String name) {

        // 创建一个pojo
        ItaoContentCategoryDO contentCategory = new ItaoContentCategoryDO();
        contentCategory.setName(name);
        contentCategory.setIsParent(false);
        // '状态。可选值:1(正常),2(删除)',
        contentCategory.setStatus(1);
        contentCategory.setParentId(parentId);
        contentCategory.setSortOrder(1);
        contentCategory.setCreated(new Date());
        contentCategory.setUpdated(new Date());
        // 添加记录
        itaoContentCategoryDOMapper.insert(contentCategory);
        // 查看父节点的isParent列是否为true，如果不是true改成true
        ItaoContentCategoryDO parentCat = itaoContentCategoryDOMapper.selectByPrimaryKey(parentId);
        // 判断是否为true
        if (!parentCat.getIsParent()) {
            parentCat.setIsParent(true);
            // 更新父节点
            itaoContentCategoryDOMapper.updateByPrimaryKey(parentCat);
        }
        // 返回结果
        return ITaoResult.ok(contentCategory);
    }
}
