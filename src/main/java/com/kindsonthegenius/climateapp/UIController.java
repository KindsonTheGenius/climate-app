package com.kindsonthegenius.climateapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

    @GetMapping("/index")
    public String home(){
        return "index";
    }
}
