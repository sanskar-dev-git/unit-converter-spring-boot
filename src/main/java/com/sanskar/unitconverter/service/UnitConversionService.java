package com.sanskar.unitconverter.service;

import org.springframework.stereotype.Service;

@Service
public class UnitConversionService {

    public double convertingLength(double value, String from, String to){

        double metres = convertToMetres(value, from);
        double result = convertFromMetres(metres, to);
        return round(result);
    }

    private double round(double value) {
        return Math.round(value * 100000.0) / 100000.0;
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
                throw new IllegalArgumentException("Invalid unit");
        }
    }

    private double convertFromMetres(double metres, String unit){

        switch (unit){
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
                throw new IllegalArgumentException("Invalid Unit");
        }
    }

    // ==========================
// Weight Converter
// ==========================

    public double convertingWeight(double value, String from, String to) {

        double grams = convertToGrams(value, from);

        return convertFromGrams(grams, to);
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
}

