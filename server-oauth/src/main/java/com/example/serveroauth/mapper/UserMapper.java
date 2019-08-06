package com.example.serveroauth.mapper;

import com.example.serveroauth.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUserByName(String name);
}
