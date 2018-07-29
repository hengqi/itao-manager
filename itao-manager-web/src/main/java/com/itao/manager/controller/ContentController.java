package com.itao.manager.controller;

import com.itao.common.result.EasyUIDataGridResult;
import com.itao.common.result.ITaoResult;
import com.itao.manager.dal.ItaoContentDO;
import com.itao.manager.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Think on 2017/7/24.
 */
@Controller
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/query/list")
    @ResponseBody
    public EasyUIDataGridResult getContentlist(Long categoryId, Integer page, Integer rows){
        EasyUIDataGridResult result = contentService.getItemList(categoryId, page, rows);
        return result;
    }

    @RequestMapping("/save")
    @ResponseBody
    public ITaoResult insertContent(ItaoContentDO content) {
        ITaoResult result = contentService.insertContent(content);
        return result;
    }

}