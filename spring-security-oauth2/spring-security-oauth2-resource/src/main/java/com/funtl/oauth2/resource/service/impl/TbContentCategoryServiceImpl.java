package com.funtl.oauth2.resource.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.funtl.oauth2.resource.dao.TbContentCategoryDao;
import com.funtl.oauth2.resource.service.TbContentCategoryService;
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService{

    @Resource
    private TbContentCategoryDao tbContentCategoryDao;

}
