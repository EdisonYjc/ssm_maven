package cn.itcast.ssm.dao;

import cn.itcast.ssm.pojo.Items;

public interface ItemsMapper {
    public Items findById(Integer id);
}