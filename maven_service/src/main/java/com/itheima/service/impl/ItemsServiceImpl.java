package com.itheima.service.impl;

import com.itheima.domain.Items;
import com.itheima.mapper.ItemsMapper;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper mapper;

    @Override
    public Items findById(Integer id) {
        System.out.println(mapper);
        return mapper.findById(id);
    }
}
