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
    // ==========================
// Speed Converter
// ==========================

    public double convertSpeed(double value,
                               String from,
                               String to) {

        double metersPerSecond = convertToMetersPerSecond(value, from);

        return round(convertFromMetersPerSecond(metersPerSecond, to));
    }

    private double convertToMetersPerSecond(double value,
                                            String unit) {

        switch (unit) {

            case "mps":
                return value;

            case "kmh":
                return value / 3.6;

            case "mph":
                return value * 0.44704;

            case "fps":
                return value * 0.3048;

            case "knot":
                return value * 0.514444;

            default:
                throw new IllegalArgumentException("Invalid speed unit");
        }
    }

    private double convertFromMetersPerSecond(double metersPerSecond,
                                              String unit) {

        switch (unit) {

            case "mps":
                return metersPerSecond;

            case "kmh":
                return metersPerSecond * 3.6;

            case "mph":
                return metersPerSecond / 0.44704;

            case "fps":
                return metersPerSecond / 0.3048;

            case "knot":
                return metersPerSecond / 0.514444;

            default:
                throw new IllegalArgumentException("Invalid speed unit");
        }
    }
    // ==========================
// Time Converter
// ==========================

    public double convertTime(double value,
                              String from,
                              String to) {

        double seconds = convertToSeconds(value, from);

        return round(convertFromSeconds(seconds, to));
    }

    private double convertToSeconds(double value,
                                    String unit) {

        switch (unit) {

            case "ms":
                return value / 1000;

            case "sec":
                return value;

            case "min":
                return value * 60;

            case "hr":
                return value * 3600;

            case "day":
                return value * 86400;

            case "week":
                return value * 604800;

            default:
                throw new IllegalArgumentException("Invalid time unit");
        }
    }

    private double convertFromSeconds(double seconds,
                                      String unit) {

        switch (unit) {

            case "ms":
                return seconds * 1000;

            case "sec":
                return seconds;

            case "min":
                return seconds / 60;

            case "hr":
                return seconds / 3600;

            case "day":
                return seconds / 86400;

            case "week":
                return seconds / 604800;

            default:
                throw new IllegalArgumentException("Invalid time unit");
        }
    }
    // ==========================
// Data Storage Converter
// ==========================

    public double convertDataStorage(double value,
                                     String from,
                                     String to) {

        double bytes = convertToBytes(value, from);

        return round(convertFromBytes(bytes, to));
    }

    private double convertToBytes(double value,
                                  String unit) {

        switch (unit) {

            case "bit":
                return value / 8;

            case "byte":
                return value;

            case "kb":
                return value * 1024;

            case "mb":
                return value * 1024 * 1024;

            case "gb":
                return value * 1024 * 1024 * 1024;

            case "tb":
                return value * 1024 * 1024 * 1024 * 1024L;

            default:
                throw new IllegalArgumentException("Invalid data storage unit");
        }
    }

    private double convertFromBytes(double bytes,
                                    String unit) {

        switch (unit) {

            case "bit":
                return bytes * 8;

            case "byte":
                return bytes;

            case "kb":
                return bytes / 1024;

            case "mb":
                return bytes / (1024 * 1024);

            case "gb":
                return bytes / (1024 * 1024 * 1024);

            case "tb":
                return bytes / (1024.0 * 1024 * 1024 * 1024);

            default:
                throw new IllegalArgumentException("Invalid data storage unit");
        }
    }
    // ==========================
// Pressure Converter
// ==========================

    public double convertPressure(double value,
                                  String from,
                                  String to) {

        double pascal = convertToPascal(value, from);

        return round(convertFromPascal(pascal, to));
    }

    private double convertToPascal(double value,
                                   String unit) {

        switch (unit) {

            case "pa":
                return value;

            case "kpa":
                return value * 1000;

            case "bar":
                return value * 100000;

            case "psi":
                return value * 6894.757;

            case "atm":
                return value * 101325;

            case "torr":
                return value * 133.322;

            default:
                throw new IllegalArgumentException("Invalid pressure unit");
        }
    }

    private double convertFromPascal(double pascal,
                                     String unit) {

        switch (unit) {

            case "pa":
                return pascal;

            case "kpa":
                return pascal / 1000;

            case "bar":
                return pascal / 100000;

            case "psi":
                return pascal / 6894.757;

            case "atm":
                return pascal / 101325;

            case "torr":
                return pascal / 133.322;

            default:
                throw new IllegalArgumentException("Invalid pressure unit");
        }
    }
    // ==========================
// Energy Converter
// ==========================

    public double convertEnergy(double value, String from, String to) {

        double joules = convertToJoules(value, from);

        return round(convertFromJoules(joules, to));
    }

    private double convertToJoules(double value, String unit) {

        switch (unit) {

            case "j":
                return value;

            case "kj":
                return value * 1000;

            case "cal":
                return value * 4.184;

            case "kcal":
                return value * 4184;

            case "wh":
                return value * 3600;

            case "kwh":
                return value * 3_600_000;

            case "ev":
                return value * 1.602176634E-19;

            default:
                throw new IllegalArgumentException("Invalid energy unit");
        }
    }

    private double convertFromJoules(double joules, String unit) {

        switch (unit) {

            case "j":
                return joules;

            case "kj":
                return joules / 1000;

            case "cal":
                return joules / 4.184;

            case "kcal":
                return joules / 4184;

            case "wh":
                return joules / 3600;

            case "kwh":
                return joules / 3_600_000;

            case "ev":
                return joules / 1.602176634E-19;

            default:
                throw new IllegalArgumentException("Invalid energy unit");
        }
    }
    // ==========================
// Power Converter
// ==========================

    public double convertPower(double value, String from, String to) {

        double watts = convertToWatts(value, from);

        return round(convertFromWatts(watts, to));
    }

    private double convertToWatts(double value, String unit) {

        switch (unit) {

            case "w":
                return value;

            case "kw":
                return value * 1000;

            case "mw":
                return value * 1_000_000;

            case "hp":
                return value * 745.699872;

            case "btuh":
                return value * 0.29307107;

            default:
                throw new IllegalArgumentException("Invalid power unit");
        }
    }

    private double convertFromWatts(double watts, String unit) {

        switch (unit) {

            case "w":
                return watts;

            case "kw":
                return watts / 1000;

            case "mw":
                return watts / 1_000_000;

            case "hp":
                return watts / 745.699872;

            case "btuh":
                return watts / 0.29307107;

            default:
                throw new IllegalArgumentException("Invalid power unit");
        }
    }
}
