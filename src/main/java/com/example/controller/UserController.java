package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("getuser")
    public String  getuser(){
        System.out.println("qqqq");
        return "helloworld";
    }


}






