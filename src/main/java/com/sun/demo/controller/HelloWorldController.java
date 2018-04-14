package com.sun.demo.controller;

import com.sun.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/index")
    public String index() {
        return "hello";
    }


}
