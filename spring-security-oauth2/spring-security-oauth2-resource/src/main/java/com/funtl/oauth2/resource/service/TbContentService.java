package com.funtl.oauth2.resource.service;

import com.funtl.oauth2.resource.domain.TbContent;

import java.util.List;

public interface TbContentService {

    /**
     * 根据 ID 获取
     *
     * @param id ID
     * @return {@link TbContent}
     */
    TbContent getById(Long id);

    /**
     * 获取全部数据
     *
     * @return {@link List<TbContent>}
     */
    List<TbContent> selectAll();

    /**
     * 新增
     *
     * @param tbContent {@link TbContent}
     * @return int 数据库受影响行数
     */
    TbContent insert(TbContent tbContent);

    /**
     * 编辑
     *
     * @param tbContent {@link TbContent}
     * @return int 数据库受影响行数
     */
    TbContent update(TbContent tbContent);

    /**
     * 删除
     *
     * @param id ID
     * @return int 数据库受影响行数
     */
    void delete(Long id);

}
