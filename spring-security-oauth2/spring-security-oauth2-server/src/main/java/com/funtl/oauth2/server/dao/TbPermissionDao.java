package com.funtl.oauth2.server.dao;

import com.funtl.oauth2.server.domain.TbPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TbPermissionDao extends JpaRepository<TbPermission, Long>, JpaSpecificationExecutor<TbPermission> {

    @Query(value = "SELECT p.* FROM tb_user AS u LEFT JOIN tb_user_role AS ur ON u.id = ur.user_id LEFT JOIN tb_role AS r ON r.id = ur.role_id LEFT JOIN tb_role_permission AS rp ON r.id = rp.role_id LEFT JOIN tb_permission AS p ON p.id = rp.permission_id WHERE u.id = :userId", nativeQuery = true)
    List<TbPermission> selectByUserId(Long userId);
}