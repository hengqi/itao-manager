package com.itao.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itao.common.result.EasyUIDataGridResult;
import com.itao.common.result.ITaoResult;
import com.itao.manager.dal.ItaoContentDO;
import com.itao.manager.dal.ItaoContentDOExample;
import com.itao.manager.mapper.ItaoContentDOMapper;
import com.itao.manager.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    ItaoContentDOMapper itaoContentDOMapper;

    @Override
    public ITaoResult insertContent(ItaoContentDO content) {
        // 补全pojo内容
        content.setCreated(new Date());
        content.setUpdated(new Date());
        itaoContentDOMapper.insert(content);

        // 添加缓存同步
//        try {
//            HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_SYSC_URL + content.getCategoryId());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return ITaoResult.ok();
    }

    @Override
    public EasyUIDataGridResult getItemList(Long categoryId, Integer page, Integer rows) {
        ItaoContentDOExample example = new ItaoContentDOExample();
        example.createCriteria().andCategoryIdEqualTo(categoryId);
        PageHelper.startPage(page, rows);
        List<ItaoContentDO> list = itaoContentDOMapper.selectByExample(example);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setRows(list);
        PageInfo<ItaoContentDO> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

}
