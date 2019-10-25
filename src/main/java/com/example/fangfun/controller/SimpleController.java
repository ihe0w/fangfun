package com.example.fangfun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class SimpleController {
    @RequestMapping(value = "/")
    public String hello(){
        return "Hhello,Worldhello,Worldhello,Worldserver:\n";
    }


}
