package com.pg.manager.contract.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractControllers {

    @GetMapping("/")
     String hello(){
        return "hello";
    }

}
