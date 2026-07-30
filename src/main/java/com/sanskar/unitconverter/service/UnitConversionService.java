package com.sanskar.unitconverter.service;

import org.springframework.stereotype.Service;

@Service
public class UnitConversionService {

    // ==========================
    // Length Converter
    // ==========================

    public double convertingLength(double value, String from, String to) {

        double metres = convertToMetres(value, from);
        double result = convertFromMetres(metres, to);

        return round(result);
    }

    private double convertToMetres(double value, String unit) {

        switch (unit) {

            case "mm":
                return value / 1000;

            case "cm":
                return value / 100;

            case "m":
                return value;

            case "km":
                return value * 1000;

            case "inch":
                return value * 0.0254;

            case "foot":
                return value * 0.3048;

            case "yard":
                return value * 0.9144;

            case "mile":
                return value * 1609.344;

            default:
                throw new IllegalArgumentException("Invalid length unit");
        }
    }

    private double convertFromMetres(double metres, String unit) {

        switch (unit) {

            case "mm":
                return metres * 1000;

            case "cm":
                return metres * 100;

            case "m":
                return metres;

            case "km":
                return metres / 1000;

            case "inch":
                return metres / 0.0254;

            case "foot":
                return metres / 0.3048;

            case "yard":
                return metres / 0.9144;

            case "mile":
                return metres / 1609.344;

            default:
                throw new IllegalArgumentException("Invalid length unit");
        }
    }

    // ==========================
    // Weight Converter
    // ==========================

    public double convertingWeight(double value, String from, String to) {

        double grams = convertToGrams(value, from);

        return round(convertFromGrams(grams, to));
    }

    private double convertToGrams(double value, String unit) {

        switch (unit) {

            case "mg":
                return value / 1000;

            case "g":
                return value;

            case "kg":
                return value * 1000;

            case "ton":
                return value * 1_000_000;

            case "oz":
                return value * 28.3495;

            case "lb":
                return value * 453.592;

            default:
                throw new IllegalArgumentException("Invalid weight unit");
        }
    }

    private double convertFromGrams(double grams, String unit) {

        switch (unit) {

            case "mg":
                return grams * 1000;

            case "g":
                return grams;

            case "kg":
                return grams / 1000;

            case "ton":
                return grams / 1_000_000;

            case "oz":
                return grams / 28.3495;

            case "lb":
                return grams / 453.592;

            default:
                throw new IllegalArgumentException("Invalid weight unit");
        }
    }

    // ==========================
    // Temperature Converter
    // ==========================

    public double convertTemperature(double value,
                                     String from,
                                     String to) {

        // Same unit
        if (from.equals(to)) {
            return value;
        }

        // Celsius
        if (from.equals("c") && to.equals("f"))
            return round((value * 9 / 5) + 32);

        if (from.equals("c") && to.equals("k"))
            return round(value + 273.15);

        // Fahrenheit
        if (from.equals("f") && to.equals("c"))
            return round((value - 32) * 5 / 9);

        if (from.equals("f") && to.equals("k"))
            return round((value - 32) * 5 / 9 + 273.15);

        // Kelvin
        if (from.equals("k") && to.equals("c"))
            return round(value - 273.15);

        if (from.equals("k") && to.equals("f"))
            return round((value - 273.15) * 9 / 5 + 32);

        throw new IllegalArgumentException("Invalid temperature unit");
    }

    // ==========================
    // Common Round Method
    // ==========================

    private double round(double value) {

        return Math.round(value * 100000.0) / 100000.0;
    }

}