package com.example.controller;

import com.example.entity.TUserEntity;
import com.example.service.TuserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/user")
@RestController
public class UserController {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    TuserService tuserService;

    @RequestMapping("getuser")
    public String getuser() {
        System.out.println("qqqq");
        return "9091";
    }

    @RequestMapping("getAllUser")
    public List<TUserEntity> getAllUser() {
        List<TUserEntity> list = tuserService.selectAll();
        logger.info("getAllUser is coming");
        return list;
    }

}






