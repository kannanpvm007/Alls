package com.kgisl.controller;

import com.kgisl.model.Country;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * HelloSpring
 */

@Controller
@RequestMapping("/")
public class HelloSpring {

  @RequestMapping(method = RequestMethod.GET,consumes)
  public String index(ModelMap model){
      Country country =new Country(1,"");
      model.addAttribute("message", "Spring MVC XML Config Example");
      return "index";
  }
}