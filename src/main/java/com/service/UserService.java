package com.service;

import org.springframework.stereotype.Service;

import com.controller.dto.UsersDto;
import com.model.Users;


/**
 * @version 2019年12月10日 下午4:02:40
 */
@Service
public interface UserService
{
    String save(UsersDto users);
    Users login(String account);
}
