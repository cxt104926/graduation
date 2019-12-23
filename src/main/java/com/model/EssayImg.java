package com.model;

/**
 * @version 2019年12月20日 下午4:05:33
 */
public class EssayImg
{
    private int id;
    
    private int essayId;
    
    private String img;
    
    public EssayImg()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getEssayId()
    {
        return essayId;
    }
    
    public void setEssayId(int essayId)
    {
        this.essayId = essayId;
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
