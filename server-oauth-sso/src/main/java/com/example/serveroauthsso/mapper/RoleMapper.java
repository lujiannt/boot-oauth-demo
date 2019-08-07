package com.example.serveroauthsso.mapper;

import com.example.serveroauthsso.entity.Role;
import com.example.serveroauthsso.entity.Url;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    List<Role> selectRoleByUserId(int userId);

    List<Url> selectUrlByRoleId(int roleId);

    Role selectRoleByName(String roleName);
}
