package com.service;
/**   
* @version 2019年12月20日 上午10:20:18 
*/

import java.util.List;

import com.model.Column;

public interface IndexService
{
     List<Column> findColumn();
     
     List<Column> findNewEssays();
    
}
