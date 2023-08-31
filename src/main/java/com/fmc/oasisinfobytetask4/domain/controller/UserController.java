package com.fmc.oasisinfobytetask4.domain.controller;

import com.fmc.oasisinfobytetask4.domain.User;
import com.fmc.oasisinfobytetask4.service.implementation.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test/api")
public class UserController {

    final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }
    @PostMapping("/signin")
    public String login(@ModelAttribute User user, Model model){
        boolean login = userService.login(user);
         if (!login){
             model.addAttribute("errorMessage", "Login failed. Please try again.");
             return "error-404";
         }
        return "redirect:/login";
    }

}
