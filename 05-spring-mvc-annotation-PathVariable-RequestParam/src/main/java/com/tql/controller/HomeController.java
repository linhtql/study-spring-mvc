package com.tql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }
    @RequestMapping("/test1/{id}")
    @ResponseBody
    public String test1(@PathVariable("id") int id, Model model) {
        return "/test1/"+id;
    }
    @RequestMapping("/test2/{id}/{name}")
    @ResponseBody
    public String test2(@PathVariable int id, @PathVariable String name, Model model) {
        return "/test2/"+id+"/"+name;
    }
    @RequestMapping("/test3")
    @ResponseBody
    public String test3(@RequestParam String name, @RequestParam int id, Model model) {
        return "/test3/"+id+"/"+name;
    }
}