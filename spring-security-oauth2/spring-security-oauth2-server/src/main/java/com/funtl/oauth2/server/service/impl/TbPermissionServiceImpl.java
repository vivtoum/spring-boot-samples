package com.funtl.oauth2.server.service.impl;

import com.funtl.oauth2.server.domain.TbPermission;
import com.funtl.oauth2.server.dao.TbPermissionDao;
import com.funtl.oauth2.server.service.TbPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Autowired
    private TbPermissionDao tbPermissionDao;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionDao.selectByUserId(userId);
    }
}
