package com.example.trade.controller;


import com.example.trade.entity.Lbt;
import com.example.trade.entity.Message;
import com.example.trade.entity.Meta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;


@Controller
public class User {

    @RequestMapping("login")
    public String login(Model model){
        //D:\\javaProject\\Trade\\src\\main\\resources\\static
        model.addAttribute("login","video.jpg");
        return "login";
    }

    @RequestMapping("/home")
    @ResponseBody
    public Lbt re(){

        Message message = new Message("http://localhost:8080/login","navigate",129,"/pages/goods_detail/index?goods_id=129");
        Meta meta = new Meta("获取成功",200);

        return new Lbt(message,meta);
    }

}
