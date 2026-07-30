package com.sanskar.unitconverter.controller;

import com.sanskar.unitconverter.model.LengthConversionRequest;
import com.sanskar.unitconverter.model.WeightConversionRequest;
import com.sanskar.unitconverter.model.TemperatureConversionRequest;
import com.sanskar.unitconverter.model.VolumeConversionRequest;
import com.sanskar.unitconverter.service.UnitConversionService;
import com.sanskar.unitconverter.util.UnitFormatter;
import com.sanskar.unitconverter.model.AreaConversionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.sanskar.unitconverter.model.SpeedConversionRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.sanskar.unitconverter.model.TimeConversionRequest;

import java.text.DecimalFormat;

@Controller
public class HomeController {

    @Autowired
    private UnitConversionService unitConversionService;

    private final DecimalFormat df = new DecimalFormat("#.#####");

    // ==========================
    // Home Page
    // ==========================

    @GetMapping("/")
    public String home() {
        return "index";
    }

    // ==========================
    // Length Converter
    // ==========================

    @GetMapping("/length")
    public String length(Model model) {

        model.addAttribute("request", new LengthConversionRequest());

        return "length";
    }

    @PostMapping("/length")
    public String convertLength(
            @ModelAttribute("request") LengthConversionRequest request,
            Model model) {

        double convertedValue = unitConversionService.convertingLength(
                request.getValue(),
                request.getFrom(),
                request.getTo());

        model.addAttribute("request", request);
        model.addAttribute("result", df.format(convertedValue));

        model.addAttribute("fromUnit",
                UnitFormatter.format(request.getFrom()));

        model.addAttribute("toUnit",
                UnitFormatter.format(request.getTo()));

        return "length";
    }

    // ==========================
    // Weight Converter
    // ==========================

    @GetMapping("/weight")
    public String weight(Model model) {

        model.addAttribute("request", new WeightConversionRequest());

        return "weight";
    }

    @PostMapping("/weight")
    public String convertWeight(
            @ModelAttribute("request") WeightConversionRequest request,
            Model model) {

        double convertedValue = unitConversionService.convertingWeight(
                request.getValue(),
                request.getFrom(),
                request.getTo());

        model.addAttribute("request", request);
        model.addAttribute("result", df.format(convertedValue));

        model.addAttribute("fromUnit",
                UnitFormatter.format(request.getFrom()));

        model.addAttribute("toUnit",
                UnitFormatter.format(request.getTo()));

        return "weight";
    }

    // ==========================
    // Temperature Converter
    // ==========================

    @GetMapping("/temperature")
    public String temperature(Model model) {

        model.addAttribute("request", new TemperatureConversionRequest());

        return "temperature";
    }

    @PostMapping("/temperature")
    public String convertTemperature(
            @ModelAttribute("request") TemperatureConversionRequest request,
            Model model) {

        double convertedValue = unitConversionService.convertTemperature(
                request.getValue(),
                request.getFrom(),
                request.getTo());

        model.addAttribute("request", request);
        model.addAttribute("result", df.format(convertedValue));

        model.addAttribute("fromUnit",
                UnitFormatter.format(request.getFrom()));

        model.addAttribute("toUnit",
                UnitFormatter.format(request.getTo()));

        return "temperature";
    }

    // ==========================
    // Volume Converter
    // ==========================

    @GetMapping("/volume")
    public String volume(Model model) {

        model.addAttribute("request", new VolumeConversionRequest());

        return "volume";
    }

    @PostMapping("/volume")
    public String convertVolume(
            @ModelAttribute("request") VolumeConversionRequest request,
            Model model) {

        double convertedValue = unitConversionService.convertVolume(
                request.getValue(),
                request.getFrom(),
                request.getTo());

        model.addAttribute("request", request);
        model.addAttribute("result", df.format(convertedValue));

        model.addAttribute("fromUnit",
                UnitFormatter.format(request.getFrom()));

        model.addAttribute("toUnit",
                UnitFormatter.format(request.getTo()));

        return "volume";
    }
    // ==========================
// Area Converter
// ==========================

    @GetMapping("/area")
    public String area(Model model) {

        model.addAttribute("request", new AreaConversionRequest());

        return "area";
    }

    @PostMapping("/area")
    public String convertArea(
            @ModelAttribute("request") AreaConversionRequest request,
            Model model) {

        double convertedValue = unitConversionService.convertArea(
                request.getValue(),
                request.getFrom(),
                request.getTo());

        model.addAttribute("request", request);
        model.addAttribute("result", df.format(convertedValue));

        model.addAttribute("fromUnit",
                UnitFormatter.format(request.getFrom()));

        model.addAttribute("toUnit",
                UnitFormatter.format(request.getTo()));

        return "area";
    }
    // ==========================
// Speed Converter
// ==========================

    @GetMapping("/speed")
    public String speed(Model model) {

        model.addAttribute("request", new SpeedConversionRequest());

        return "speed";
    }

    @PostMapping("/speed")
    public String convertSpeed(
            @ModelAttribute("request") SpeedConversionRequest request,
            Model model) {

        double convertedValue = unitConversionService.convertSpeed(
                request.getValue(),
                request.getFrom(),
                request.getTo());

        model.addAttribute("request", request);
        model.addAttribute("result", df.format(convertedValue));

        model.addAttribute("fromUnit",
                UnitFormatter.format(request.getFrom()));

        model.addAttribute("toUnit",
                UnitFormatter.format(request.getTo()));

        return "speed";
    }
    // ==========================
// Time Converter
// ==========================

    @GetMapping("/time")
    public String time(Model model) {

        model.addAttribute("request", new TimeConversionRequest());

        return "time";
    }

    @PostMapping("/time")
    public String convertTime(
            @ModelAttribute("request") TimeConversionRequest request,
            Model model) {

        double convertedValue = unitConversionService.convertTime(
                request.getValue(),
                request.getFrom(),
                request.getTo());

        model.addAttribute("request", request);

        model.addAttribute("result",
                df.format(convertedValue));

        model.addAttribute("fromUnit",
                UnitFormatter.format(request.getFrom()));

        model.addAttribute("toUnit",
                UnitFormatter.format(request.getTo()));

        return "time";
    }
}