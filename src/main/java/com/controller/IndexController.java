package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Column;
import com.service.IndexService;
import com.utils.Message;
import com.utils.MessageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**   
* @version 2019年12月20日 上午9:52:25 
*/
@RestController
@RequestMapping("/index")
@Api(description = "首页相关接口")
public class IndexController
{
   @Autowired
   private IndexService service;
    
    @GetMapping("/findColumn")
    @ApiOperation("查询一级栏目")
    public Message findColumn() {
       List<Column> list = service.findColumn();
        return MessageUtil.success(list);
    }
    
    
    @GetMapping("/findNewEssay")
    @ApiOperation(value = "查询最新10篇文章",notes = "查询出的有文章标题，文章简介，文章点赞数，文章的评论数量")
    public Message findNewEssay() {
        
        
        
        return null;
    }
}
