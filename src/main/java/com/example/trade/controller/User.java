package com.example.trade.controller;


import com.example.trade.entity.Lbt;
import com.example.trade.entity.Message;
import com.example.trade.entity.Meta;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


@Controller
public class User {

    @RequestMapping("login")
    @ResponseBody
    public String login(Model model){
        //D:\\javaProject\\Trade\\src\\main\\resources\\static

        return "http://localhost:8080/video.jpg";
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

    @RequestMapping(value = "/get1",produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getImage1() throws IOException {
        String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
        String filePath = path + "static/image/video.png";
        File file = new File(filePath);
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }

}
