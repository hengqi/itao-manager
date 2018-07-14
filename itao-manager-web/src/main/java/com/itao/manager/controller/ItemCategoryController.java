package com.itao.manager.controller;

import com.itao.common.result.EasyUITreeNode;
import com.itao.manager.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/item/cat")
@Controller
public class ItemCategoryController {

    @Autowired
    private ItemCategoryService itemCatService;

    /**
     * 商品类目列表
     * @param parentId
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITreeNode> categoryList(@RequestParam(value="id", defaultValue="0") Long parentId) throws Exception {
        List<EasyUITreeNode> itemCatList = itemCatService.getItemCatList(parentId);
        return itemCatList;
    }
}

