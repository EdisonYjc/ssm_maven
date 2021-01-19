package cn.itcast.ssm.test;

import cn.itcast.ssm.dao.ItemsMapper;
import cn.itcast.ssm.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemDaoTest {
    @Test
    public void testFindItemsById() {
        //获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取Mapper
        ItemsMapper itemsMapper = applicationContext.getBean(ItemsMapper.class);
        //调用Mapper方法
        Items items = itemsMapper.findById(1);
        System.out.println(items);
    }
}