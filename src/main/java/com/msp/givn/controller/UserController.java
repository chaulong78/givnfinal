package com.msp.givn.controller;

import com.msp.givn.entity.User;
import com.msp.givn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/")
    public ModelAndView showUser(){
        ModelAndView modelAndView = new ModelAndView("home");

        User user = userRepository.findById(1);
        modelAndView.addObject("user", user);

        return modelAndView;
    }
}
