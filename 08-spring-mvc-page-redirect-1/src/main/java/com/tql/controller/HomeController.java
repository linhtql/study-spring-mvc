package com.tql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String page1() {
        return "page1";
    }


//    @RequestMapping(value = "/redirect")
//    public String redirect() {
//        return "redirect:page2";
//    }

    @RequestMapping(value = "/redirect")
    public RedirectView redirectView() {
        return new RedirectView("page2");
    }

    @RequestMapping("/page2")
    public String page2() {
        return "page2";
    }
}
