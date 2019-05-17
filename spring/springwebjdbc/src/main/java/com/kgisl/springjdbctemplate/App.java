package com.kgisl.springjdbctemplate;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * App
 */@Controller
 @RequestMapping("/")
 public class App {
    @RequestMapping( method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Welcome");
        return "index";
    }
}

