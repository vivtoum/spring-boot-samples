package com.funtl.oauth2.server.service.impl;

import com.funtl.oauth2.server.domain.TbUser;
import com.funtl.oauth2.server.dao.TbUserDao;
import com.funtl.oauth2.server.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserDao tbUserDao;

    @Override
    public TbUser getByUsername(String username) {
        return tbUserDao.findByUsername(username);
    }
}
