package com.model;

import java.util.List;

/**   
* @version 2019年12月20日 下午3:33:14 
*/

import javax.xml.crypto.Data;

public class Essay
{
    private int id;
    
    // 标题
    private String title;
    
    // 作者
    private Users user;
    
    // 发表时间
    private Data time;
    
    // 简介
    private String introduce;
    
    // 内容
    private StringBuffer content;
    
    // 点赞数量
    private int essayCount;
    
    // 文章类型【原创、转发】
    private String type;
    
    // 文章分类
    private Column column;
    
    // 文章找中的图片
    private List<EssayImg> img;
    
    // 文章的评论
    private List<Comment> comment;
    
    public Essay()
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
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public Users getUser()
    {
        return user;
    }
    
    public void setUser(Users user)
    {
        this.user = user;
    }
    
    public Data getTime()
    {
        return time;
    }
    
    public void setTime(Data time)
    {
        this.time = time;
    }
    
    public String getIntroduce()
    {
        return introduce;
    }
    
    public void setIntroduce(String introduce)
    {
        this.introduce = introduce;
    }
    
    public StringBuffer getContent()
    {
        return content;
    }
    
    public void setContent(StringBuffer content)
    {
        this.content = content;
    }
    
    public int getEssayCount()
    {
        return essayCount;
    }
    
    public void setEssayCount(int essayCount)
    {
        this.essayCount = essayCount;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public Column getColumn()
    {
        return column;
    }
    
    public void setColumn(Column column)
    {
        this.column = column;
    }
    
    public List<EssayImg> getImg()
    {
        return img;
    }
    
    public void setImg(List<EssayImg> img)
    {
        this.img = img;
    }
    
    public List<Comment> getComment()
    {
        return comment;
    }
    
    public void setComment(List<Comment> comment)
    {
        this.comment = comment;
    }
    
}
