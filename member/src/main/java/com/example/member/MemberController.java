package com.example.member;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getMember")
    public String getMember() {
        return "this is member 服务提供者！！！端口号：" + serverPort;
    }
}
