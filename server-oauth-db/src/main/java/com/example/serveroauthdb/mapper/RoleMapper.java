package com.example.serveroauthdb.mapper;

import com.example.serveroauthdb.entity.Role;
import com.example.serveroauthdb.entity.Url;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    List<Role> selectRoleByUserId(int userId);

    List<Url> selectUrlByRoleId(int roleId);

    Role selectRoleByName(String roleName);
}
