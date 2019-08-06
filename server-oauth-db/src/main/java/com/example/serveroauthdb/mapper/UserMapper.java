package com.example.serveroauthdb.mapper;

import com.example.serveroauthdb.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUserByName(String name);
}
