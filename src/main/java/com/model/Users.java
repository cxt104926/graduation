package com.model;

/**
 * @version 2019年12月10日 下午3:35:58
 * 
 * 用户信息表
 */

// implements Serializable 可以实现对象的序列化
public class Users
{
    private int id;
    
    private String username;
    
    private String password;
    
    private String gender;
    
    private int authority;
    
    private String phone;
    
    private String emily;
    
    private int credit;
    
    private String img;
    
    public Users()
    {
    }

    public Users(int id, String username, String password, String gender, int authority, String phone, String emily,
        int credit, String img)
    {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.authority = authority;
        this.phone = phone;
        this.emily = emily;
        this.credit = credit;
        this.img = img;
    }

    @Override
    public String toString()
    {
        return "Users [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender
            + ", authority=" + authority + ", phone=" + phone + ", emily=" + emily + ", credit=" + credit + ", img="
            + img + "]";
    }

    public long getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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

    public int getCredit()
    {
        return credit;
    }

    public void setCredit(int credit)
    {
        this.credit = credit;
    }

    public String getImg()
    {
        return img;
    }

    public void setImg(String img)
    {
        this.img = img;
    }
    
}
