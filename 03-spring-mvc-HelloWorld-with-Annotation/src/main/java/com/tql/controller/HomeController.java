package com.tql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "/home"})
    public String index() {
        return "home";
    }

    @RequestMapping("/hello")
    public String hello() {
        return  "hello";
    }
}
