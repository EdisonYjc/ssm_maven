package cn.itcast.ssm.controller;

import cn.itcast.ssm.pojo.Items;
import cn.itcast.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items/")
public class ItemsController {
    @Autowired
    private ItemsService itemsService ;
    //展示商品信息页面 http://localhost:8080/items/showItem.action?id=1
    @RequestMapping("/showItem")
    public String showItem(int id, Model model){
        Items item = itemsService.findById(id);
        model.addAttribute("item",item);
        return "viewItem";
    }
}
