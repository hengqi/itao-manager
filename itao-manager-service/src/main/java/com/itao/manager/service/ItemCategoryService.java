package com.itao.manager.service;

import com.itao.common.result.EasyUITreeNode;

import java.util.List;

public interface ItemCategoryService {

    List<EasyUITreeNode> getItemCatList(Long parentId) throws Exception;
}
