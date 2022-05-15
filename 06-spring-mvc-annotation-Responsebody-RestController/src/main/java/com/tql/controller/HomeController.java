package com.tql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = {"/","/home"})
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1() {
        return "test1";
    }
}
