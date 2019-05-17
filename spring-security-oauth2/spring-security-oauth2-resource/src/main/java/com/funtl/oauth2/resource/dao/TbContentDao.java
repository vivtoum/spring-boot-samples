package com.funtl.oauth2.resource.dao;

import com.funtl.oauth2.resource.domain.TbContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TbContentDao extends JpaRepository<TbContent, Long>, JpaSpecificationExecutor<TbContent> {

}