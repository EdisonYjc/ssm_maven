package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.dao.ItemsMapper;
import cn.itcast.ssm.pojo.Items;
import cn.itcast.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public Items findById(int itemId) {
        return itemsMapper.findById(itemId);
    }
}
