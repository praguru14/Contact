package com.pg.manager.contract.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("title","Home: Contact");
        return "home";
    }
    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("title","About: Contact");
        return "about";
    }

}
