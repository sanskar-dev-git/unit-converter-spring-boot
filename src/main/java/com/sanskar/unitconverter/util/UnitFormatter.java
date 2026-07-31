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

            // ==========================
// Speed Units
// ==========================

            case "mps":
                return "Meter/Second";

            case "kmh":
                return "Kilometer/Hour";

            case "mph":
                return "Mile/Hour";

            case "fps":
                return "Foot/Second";

            case "knot":
                return "Knot";

            // ==========================
// Time Units
// ==========================

            case "ms":
                return "Millisecond";

            case "sec":
                return "Second";

            case "min":
                return "Minute";

            case "hr":
                return "Hour";

            case "day":
                return "Day";

            case "week":
                return "Week";

            // ==========================
// Data Storage Units
// ==========================

            case "bit":
                return "Bit";

            case "byte":
                return "Byte";

            case "kb":
                return "Kilobyte";

            case "mb":
                return "Megabyte";

            case "gb":
                return "Gigabyte";

            case "tb":
                return "Terabyte";

            // ==========================
// Pressure Units
// ==========================

            case "pa":
                return "Pascal";

            case "kpa":
                return "Kilopascal";

            case "bar":
                return "Bar";

            case "psi":
                return "PSI";

            case "atm":
                return "Atmosphere";

            case "torr":
                return "Torr";

            // ==========================
// Energy Units
// ==========================

            case "j":
                return "Joule";

            case "kj":
                return "Kilojoule";

            case "cal":
                return "Calorie";

            case "kcal":
                return "Kilocalorie";

            case "wh":
                return "Watt-hour";

            case "kwh":
                return "Kilowatt-hour";

            case "ev":
                return "Electron Volt";
            default:
                return unit;

        }
    }
}