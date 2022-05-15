package com.tql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }
    @RequestMapping("/test1/{id}")
    public String test1(@PathVariable int id, Model model) {
        model.addAttribute("model",id);
        return "test1";
    }
    @RequestMapping("/test2/{id}/{name}")
    public String test2(@PathVariable int id, @PathVariable String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "test2";
    }
    @RequestMapping("/test3")
    public String test3(@RequestParam String name, @RequestParam int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "test3";
    }
}