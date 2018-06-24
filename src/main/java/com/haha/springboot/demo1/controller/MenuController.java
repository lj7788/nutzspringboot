package com.haha.springboot.demo1.controller;
import com.haha.springboot.demo1.info.TAclMenu;
import org.nutz.dao.Dao;
import org.nutz.json.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value="/menu",produces = "application/json;charset=GBK")
public class MenuController {

    @Autowired
    Dao dao;

    @RequestMapping("/list")
    public List<TAclMenu> list(){
        List<TAclMenu> list=dao.query(TAclMenu.class,null);
        System.out.println(Json.toJson(list));
        return list;
    }
}
