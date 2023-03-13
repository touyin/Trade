package com.example.trade.controller;


import com.example.trade.entity.Lbt;
import com.example.trade.entity.Message;
import com.example.trade.entity.Meta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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
        List<Message> list_Message = new ArrayList<>();

        Message message1 = new Message("http://localhost:8080/login","navigate",129,"/pages/goods_detail/index?goods_id=129");
        Message message2 = new Message("http://localhost:8080/login","navigate",129,"/pages/goods_detail/index?goods_id=129");
        Message message3 = new Message("http://localhost:8080/login","navigate",129,"/pages/goods_detail/index?goods_id=129");
        Meta meta = new Meta("获取成功",200);

        list_Message.add(message1);
        list_Message.add(message2);
        list_Message.add(message3);

        return new Lbt(list_Message,meta);
    }

}
