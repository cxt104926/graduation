package com.service.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.dto.UsersDto;
import com.mapper.UserDao;
import com.model.Users;
import com.service.UserService;

/**
 * @version 2019年12月10日 下午4:10:16
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao dao;
    
    @Override
    public String save(UsersDto users)
    {
        String msg = null;
        if (dao.findByName(users.getUsername()) != null)
        {
            msg = "用户名已经被注册";
        }
        else if (dao.findByPhone(users.getPhone()) != null)
        {
            msg = "用户手机号已经被注册";
        }
        else
        {
            dao.save(users);
            msg = "注册成功！";
        }
        return msg;
    }
    
    /**
     * 用户登录 ：判断用户名是否在数据库中
     * 
     * @return Users
     */
    @Override
    public Users login(String account)
    {
        Users users1 = null;
        if (isMobileNO(account))
        {
            users1 = dao.findByPhone(account);
        }
        else
        {
            users1 = dao.findByName(account);
        }
        
        return users1;
    }
    
    /**
     * 匹配用户手机号
     * 
     * @return boolean
     */
    public static boolean isMobileNO(String mobiles)
    {
        String reg = "^((13[0-9])|(14[5-7])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }
    
    // public static boolean isEmailNO(String emails)
    // {
    // String reg =
    // "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
    // Pattern p = Pattern.compile(reg);
    // Matcher m = p.matcher(emails);
    // return m.matches();
    // }
    
}
