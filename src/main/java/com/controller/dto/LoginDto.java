package com.controller.dto;
/**   
* @version 2019年12月18日 下午2:35:23 
* 登录的时候接收数据
*/
public class LoginDto
{
    private String account;
    private String password;
    public LoginDto()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    public String getAccount()
    {
        return account;
    }
    public void setAccount(String account)
    {
        this.account = account;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
}
