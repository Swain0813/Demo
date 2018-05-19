package com.example.controller;

import com.example.entity.TUserEntity;
import com.example.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    TuserService tuserService;

    @RequestMapping("getuser")
    public String getuser() {
        System.out.println("qqqq");
        return "helloworld";
    }

    @RequestMapping("getAllUser")
    public List<TUserEntity> getAllUser() {
        System.out.println("qqqq");
        List<TUserEntity> list = tuserService.selectAll();

        return list;
    }

}






