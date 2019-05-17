package com.funtl.oauth2.resource.service.impl;

import com.funtl.oauth2.resource.domain.TbContent;
import com.funtl.oauth2.resource.dao.TbContentDao;
import com.funtl.oauth2.resource.service.TbContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbContentServiceImpl implements TbContentService {

    @Resource
    private TbContentDao tbContentDao;

    @Override
    public TbContent getById(Long id) {
        return tbContentDao.findById(id).get();
    }

    @Override
    public List<TbContent> selectAll() {
        return tbContentDao.findAll();
    }

    @Override
    public TbContent insert(TbContent tbContent) {
        return tbContentDao.save(tbContent);
    }

    @Override
    public TbContent update(TbContent tbContent) {
        return tbContentDao.save(tbContent);
    }

    @Override
    public void delete(Long id) {
        tbContentDao.deleteById(id);
    }
}
