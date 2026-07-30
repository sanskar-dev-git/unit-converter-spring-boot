package com.sanskar.unitconverter.util;

public class UnitFormatter {

    public static String format(String unit) {

        switch (unit) {

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

            default:
                return unit;
        }
    }
}