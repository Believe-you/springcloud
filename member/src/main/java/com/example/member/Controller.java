package com.example.member;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/getMember")
    public String getMember(){
        return "this is member 服务提供者！！！";
    }
}
