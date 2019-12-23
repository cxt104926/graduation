package com.model;

/**
 * @version 2019年12月20日 上午9:58:11
 */
public class Column
{
    private int id;
    
    private String cName;
    
    private int cId;
    
    public Column()
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
    
    public String getcName()
    {
        return cName;
    }
    
    public void setcName(String cName)
    {
        this.cName = cName;
    }
    
    public int getcId()
    {
        return cId;
    }
    
    public void setcId(int cId)
    {
        this.cId = cId;
    }
    
    @Override
    public String toString()
    {
        return "Column [id=" + id + ", cName=" + cName + ", cId=" + cId + "]";
    }
    
}
