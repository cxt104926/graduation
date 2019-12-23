package com.model;

/**   
* @version 2019年12月20日 下午4:10:46 
*/

import java.util.Date;

public class Comment
{
    private int id;
    
    private int essayId;
    
    private int parentId;
    
    private String content;
    
    private int parseCount;
    
    private String img;
    
    private Date commentTime;
    
    public Comment()
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
    
    public int getParentId()
    {
        return parentId;
    }
    
    public void setParentId(int parentId)
    {
        this.parentId = parentId;
    }
    
    public String getContent()
    {
        return content;
    }
    
    public void setContent(String content)
    {
        this.content = content;
    }
    
    public int getParseCount()
    {
        return parseCount;
    }
    
    public void setParseCount(int parseCount)
    {
        this.parseCount = parseCount;
    }
    
    public String getImg()
    {
        return img;
    }
    
    public void setImg(String img)
    {
        this.img = img;
    }
    
    public Date getCommentTime()
    {
        return commentTime;
    }
    
    public void setCommentTime(Date commentTime)
    {
        this.commentTime = commentTime;
    }
    
}
