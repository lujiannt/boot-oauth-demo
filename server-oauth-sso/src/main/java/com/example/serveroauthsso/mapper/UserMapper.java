package com.example.serveroauthsso.mapper;

import com.example.serveroauthsso.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUserByName(String name);
}
