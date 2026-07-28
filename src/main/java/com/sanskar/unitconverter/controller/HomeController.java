package com.sanskar.unitconverter.controller;

import com.sanskar.unitconverter.model.LengthConversionRequest;
import com.sanskar.unitconverter.service.UnitConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class HomeController {

    @Autowired
    private UnitConversionService unitConversionService;

    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/length")
    public String length(Model model) {
        model.addAttribute("request", new LengthConversionRequest());
        return "length";
    }

    @PostMapping("/length")
    public String convertLength(
            @ModelAttribute("request") LengthConversionRequest request,
            Model model) {
            double result = unitConversionService.convertingLength(
                    request.getValue(),
                    request.getFrom(),
                    request.getTo());

            model.addAttribute("request", request);
            model.addAttribute("result", result);
            return "length";

    }
}
