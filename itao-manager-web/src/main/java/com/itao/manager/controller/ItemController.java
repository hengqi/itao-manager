package com.itao.manager.controller;

import com.itao.manager.dal.ItaoItemDO;
import com.itao.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public ItaoItemDO getItemById(@PathVariable Long itemId) {
        return itemService.getItemById(itemId);
    }
}
