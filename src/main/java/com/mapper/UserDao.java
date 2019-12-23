package com.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.controller.dto.UsersDto;
import com.model.Users;

/**   
* @version 2019年12月11日 下午2:55:56 
*/
@Mapper
public interface UserDao 
{
    int save(UsersDto usersDto);
    
    Users findByName(@Param("account")String account);
    
    Users findByPhone(@Param("phone")String phone);
    
//    Users findByEmily(@Param("name")String emily);
    
}
