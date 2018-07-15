package com.itao.manager.controller;

import com.itao.common.result.ITaoResult;
import com.itao.manager.dal.ItaoItemParamDO;
import com.itao.manager.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item/param")
public class ItemParamController {

    @Autowired
    private ItemParamService itemParamService;


    /**
     * 根据商品分类Id查询商品的规格参数
     * @param itemCatId
     * @return
     */
    @RequestMapping("/query/itemcatid/{itemCatId}")
    @ResponseBody
    public ITaoResult getItemParamByCid(@PathVariable Long itemCatId){
        ITaoResult result = itemParamService.getItemParamByCid(itemCatId);
        return result;
    }

    /**
     * 保存商品规格参数
     * @param cid
     * @param paramData
     * @return
     */
    @RequestMapping("/save/{cid}")
    @ResponseBody
    public ITaoResult saveItemParam(@PathVariable Long cid, String paramData) {
        ItaoItemParamDO itemParam = new ItaoItemParamDO();
        itemParam.setItemCatId(cid);
        itemParam.setParamData(paramData);
        ITaoResult result = itemParamService.saveItemParam(itemParam);
        return result;
    }
}
