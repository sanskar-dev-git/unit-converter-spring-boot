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

            default:
                return unit;
        }
    }
}