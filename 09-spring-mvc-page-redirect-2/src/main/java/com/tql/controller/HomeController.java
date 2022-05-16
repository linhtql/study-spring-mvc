package com.tql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        return "page1";
    }

    @RequestMapping(value = "/redirect")
    public String redirect(@RequestParam String name, RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("name", name);
        return "redirect:page2";
    }

    @RequestMapping(value = "/page2")
    public String page2(@RequestParam String name, Model model) {
        model.addAttribute("name", name.toUpperCase(Locale.ROOT));
        return "page2";
    }
}
