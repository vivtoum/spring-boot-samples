package com.funtl.oauth2.server.dao;

import com.funtl.oauth2.server.domain.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TbUserDao extends JpaRepository<TbUser, Long>, JpaSpecificationExecutor<TbUser> {

    TbUser findByUsername(String username);
}