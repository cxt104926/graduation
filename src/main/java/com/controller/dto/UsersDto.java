package com.controller.dto;

/**
 * @version 2019年12月10日 下午3:35:58
 * 
 * 用户注册信息表
 */

// implements Serializable 可以实现对象的序列化
public class UsersDto
{
    private String username;
    
    private String password;
    
    private String gender;
    
    private int authority;
    
    private String phone;
    
    private String emily;
    
    public UsersDto()
    {
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getAuthority()
    {
        return authority;
    }

    public void setAuthority(int authority)
    {
        this.authority = authority;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmily()
    {
        return emily;
    }

    public void setEmily(String emily)
    {
        this.emily = emily;
    }

    @Override
    public String toString()
    {
        return "UsersDto [username=" + username + ", password=" + password + ", gender=" + gender + ", authority="
            + authority + ", phone=" + phone + ", emily=" + emily + "]";
    }

    
}
