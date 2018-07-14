package com.itao.manager.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itao.manager.dal.ItaoItemDO;
import com.itao.manager.dal.ItaoItemDOExample;
import com.itao.manager.mapper.ItaoItemDOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class PageHelperTest {

    @Autowired
    private ItaoItemDOMapper itaoItemDOMapper;

    @Test
    public void testPageHelper() {
        ItaoItemDOExample example = new ItaoItemDOExample();
        PageHelper.startPage(1, 10);
        List<ItaoItemDO> itaoItemDOList = itaoItemDOMapper.selectByExample(example);

        itaoItemDOList.forEach(item -> System.out.println(item.getTitle()));

        PageInfo<ItaoItemDO> pageInfo = new PageInfo<>(itaoItemDOList);
        System.out.println("总条数: " + pageInfo.getTotal());
    }
}
