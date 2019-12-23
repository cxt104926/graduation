package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.impl.UserServiceImpl;
import com.utils.JwtTokenUtil;
import com.utils.Message;
import com.utils.MessageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.controller.dto.LoginDto;
import com.controller.dto.UsersDto;
import com.model.Users;

/**
 * @version 2019年12月10日 下午5:13:39
 */
@RestController
@Api(description = "登录注册界面")
@RequestMapping("/user")
public class LoginController
{
    @Autowired
    private UserServiceImpl service;
    
    /**
     * 登录使用
     * 
     * @return String
     */
    @PostMapping("/login")
    @ApiOperation(value = "登录接口", notes = "登录时候需要传入两个参数：账号（用户名或者电话号），密码")
    public Message login(LoginDto login)
    {
        // 1.认证用户的用户名和密码
        Users user = service.login(login.getAccount());
        
        if (user == null)
        {
            return MessageUtil.error("该用户尚未注册！");
        }
        else if (!user.getPassword().equals(login.getPassword()))
        {
            return MessageUtil.error("登录密码错误！");
        }
        // 2. 登录成功，产生一个token，缓存起来，返回token
        String token = JwtTokenUtil.createJWT(user.getId(), user.getUsername());
        Map<String, String> map = new HashMap<>();
        map.put("token", token);
        return MessageUtil.success(map);
    }
    
    @PostMapping("/save")
    @ApiOperation("注册接口")
    public Message save(UsersDto users)
    {
        String msg = service.save(users);
        return MessageUtil.success(msg);
    }
    
}
