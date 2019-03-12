package com.msp.givn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping(value = "/")
    public ModelAndView showUser(){
        ModelAndView modelAndView = new ModelAndView("/home");

        return modelAndView;
    }
}
