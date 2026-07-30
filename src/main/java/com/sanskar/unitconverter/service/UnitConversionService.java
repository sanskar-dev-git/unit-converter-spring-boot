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

        if (from.equals(to))
            return value;

        if (from.equals("c") && to.equals("f"))
            return round((value * 9 / 5) + 32);

        if (from.equals("c") && to.equals("k"))
            return round(value + 273.15);

        if (from.equals("f") && to.equals("c"))
            return round((value - 32) * 5 / 9);

        if (from.equals("f") && to.equals("k"))
            return round((value - 32) * 5 / 9 + 273.15);

        if (from.equals("k") && to.equals("c"))
            return round(value - 273.15);

        if (from.equals("k") && to.equals("f"))
            return round((value - 273.15) * 9 / 5 + 32);

        throw new IllegalArgumentException("Invalid temperature unit");
    }

    // ==========================
    // Volume Converter
    // ==========================

    public double convertVolume(double value,
                                String from,
                                String to) {

        double litres = convertToLitres(value, from);

        return round(convertFromLitres(litres, to));
    }

    private double convertToLitres(double value, String unit) {

        switch (unit) {

            case "ml":
                return value / 1000;

            case "l":
                return value;

            case "m3":
                return value * 1000;

            case "cm3":
                return value / 1000;

            case "gal":
                return value * 3.78541;

            case "ft3":
                return value * 28.3168;

            default:
                throw new IllegalArgumentException("Invalid volume unit");
        }
    }

    private double convertFromLitres(double litres, String unit) {

        switch (unit) {

            case "ml":
                return litres * 1000;

            case "l":
                return litres;

            case "m3":
                return litres / 1000;

            case "cm3":
                return litres * 1000;

            case "gal":
                return litres / 3.78541;

            case "ft3":
                return litres / 28.3168;

            default:
                throw new IllegalArgumentException("Invalid volume unit");
        }
    }

    // ==========================
    // Common Round Method
    // ==========================

    private double round(double value) {

        return Math.round(value * 100000.0) / 100000.0;
    }
    // ==========================
// Area Converter
// ==========================

    public double convertArea(double value,
                              String from,
                              String to) {

        double squareMeters = convertToSquareMeters(value, from);

        return round(convertFromSquareMeters(squareMeters, to));
    }

    private double convertToSquareMeters(double value,
                                         String unit) {

        switch (unit) {

            case "mm2":
                return value / 1_000_000;

            case "cm2":
                return value / 10_000;

            case "m2":
                return value;

            case "km2":
                return value * 1_000_000;

            case "in2":
                return value * 0.00064516;

            case "ft2":
                return value * 0.09290304;

            case "yd2":
                return value * 0.83612736;

            case "acre":
                return value * 4046.8564224;

            case "hectare":
                return value * 10000;

            default:
                throw new IllegalArgumentException("Invalid area unit");
        }
    }

    private double convertFromSquareMeters(double squareMeters,
                                           String unit) {

        switch (unit) {

            case "mm2":
                return squareMeters * 1_000_000;

            case "cm2":
                return squareMeters * 10_000;

            case "m2":
                return squareMeters;

            case "km2":
                return squareMeters / 1_000_000;

            case "in2":
                return squareMeters / 0.00064516;

            case "ft2":
                return squareMeters / 0.09290304;

            case "yd2":
                return squareMeters / 0.83612736;

            case "acre":
                return squareMeters / 4046.8564224;

            case "hectare":
                return squareMeters / 10000;

            default:
                throw new IllegalArgumentException("Invalid area unit");
        }
    }
}