package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.model.Column;

/**   
* @version 2019年12月20日 上午10:06:43 
*/
@Mapper
public interface IndexDao
{
    List<Column> findAllColumn();
    
    List<Column> findNewEssays();
}
