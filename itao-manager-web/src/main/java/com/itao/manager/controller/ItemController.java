package com.itao.manager.controller;

import com.itao.common.result.EasyUIDataGridResult;
import com.itao.common.result.ITaoResult;
import com.itao.manager.dal.ItaoItemDO;
import com.itao.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public ItaoItemDO getItemById(@PathVariable Long itemId) {
        return itemService.getItemById(itemId);
    }

    /**
     * 商品列表
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        EasyUIDataGridResult result = itemService.getItemList(page, rows);
        return result;
    }

    /**
     * 商品添加
     * @param item
     * @param desc
     * @param itemParams
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/save", method= RequestMethod.POST)
    @ResponseBody
    public ITaoResult createItem(ItaoItemDO item, String desc, String itemParams) throws Exception {
        ITaoResult result = itemService.createItem(item, desc, itemParams);
//        itemService.importSolr();
        return result;
    }
}
