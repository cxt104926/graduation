package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.IndexDao;
import com.model.Column;
import com.service.IndexService;

/**   
* @version 2019年12月20日 上午10:22:23 
*/
@Service
public class IndexServiceImpl implements IndexService
{
    @Autowired
    private IndexDao dao;

    @Override
    public List<Column> findColumn()
    {
        return dao.findAllColumn();
    }
    
}
