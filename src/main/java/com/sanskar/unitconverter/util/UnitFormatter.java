package com.sanskar.unitconverter.util;

public class UnitFormatter {

    public static String format(String unit) {

        switch (unit) {

            // ==========================
            // Length Units
            // ==========================

            case "mm":
                return "Millimeter";

            case "cm":
                return "Centimeter";

            case "m":
                return "Meter";

            case "km":
                return "Kilometer";

            case "inch":
                return "Inch";

            case "foot":
                return "Foot";

            case "yard":
                return "Yard";

            case "mile":
                return "Mile";

            // ==========================
            // Weight Units
            // ==========================

            case "mg":
                return "Milligram";

            case "g":
                return "Gram";

            case "kg":
                return "Kilogram";

            case "ton":
                return "Ton";

            case "oz":
                return "Ounce";

            case "lb":
                return "Pound";

            // ==========================
            // Temperature Units
            // ==========================

            case "c":
                return "°C";

            case "f":
                return "°F";

            case "k":
                return "K";

            // ==========================
            // Volume Units
            // ==========================

            case "ml":
                return "Milliliter";

            case "l":
                return "Liter";

            case "m3":
                return "Cubic Meter";

            case "cm3":
                return "Cubic Centimeter";

            case "gal":
                return "US Gallon";

            case "ft3":
                return "Cubic Foot";



            // ==========================
            // Area Units
            // ==========================

            case "mm2":
                return "Square Millimeter";

            case "cm2":
                return "Square Centimeter";

            case "m2":
                return "Square Meter";

            case "km2":
                return "Square Kilometer";

            case "in2":
                return "Square Inch";

            case "ft2":
                return "Square Foot";

            case "yd2":
                return "Square Yard";

            case "acre":
                return "Acre";

            case "hectare":
                return "Hectare";
            default:
                return unit;

        }
    }
}