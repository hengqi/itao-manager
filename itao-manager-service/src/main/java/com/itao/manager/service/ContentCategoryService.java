package com.itao.manager.service;

import com.itao.common.result.EasyUITreeNode;
import com.itao.common.result.ITaoResult;

import java.util.List;

public interface ContentCategoryService {

    List<EasyUITreeNode> getCategoryList(long parentId);

    ITaoResult insertContentCategory(Long parentId, String name);
}
