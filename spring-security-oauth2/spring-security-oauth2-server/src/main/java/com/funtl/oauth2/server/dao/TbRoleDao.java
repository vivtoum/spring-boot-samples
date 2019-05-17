package com.funtl.oauth2.server.dao;

import com.funtl.oauth2.server.domain.TbPermission;
import com.funtl.oauth2.server.domain.TbRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TbRoleDao extends JpaRepository<TbRole, Long>, JpaSpecificationExecutor<TbRole> {
}