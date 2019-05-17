package com.funtl.oauth2.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.funtl.oauth2.server.dao.TbRoleDao;
import com.funtl.oauth2.server.service.TbRoleService;
@Service
public class TbRoleServiceImpl implements TbRoleService{

    @Autowired
    private TbRoleDao tbRoleDao;

}
