package com.sanskar.unitconverter.controller;

import com.sanskar.unitconverter.service.UnitConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private UnitConversionService unitConversionService;

    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/length")
    public String length() {
        return "length";
    }

}
