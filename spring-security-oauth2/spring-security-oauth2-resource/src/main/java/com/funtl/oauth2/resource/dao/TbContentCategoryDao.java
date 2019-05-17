package com.funtl.oauth2.resource.dao;

import com.funtl.oauth2.resource.domain.TbContentCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TbContentCategoryDao extends JpaRepository<TbContentCategory, Long>, JpaSpecificationExecutor<TbContentCategory> {

}