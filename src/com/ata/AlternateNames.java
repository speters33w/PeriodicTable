package com.ata;

public class AlternateNames {
    public static String alternateElementName(String name) {
        return switch (name.toLowerCase()) {
            case "aluminium" -> "Aluminum";
            case "argentum" -> "Silver";
            case "aurum" -> "Gold";
            case "caesium", "cæsium" -> "Cesium";
            case "copernicium", "ununbium" -> "Copernicium";
            case "columbium" -> "Niobium";
            case "cuprum" -> "Copper";
            case "ferrum" -> "Iron";
            case "hydrargyrum" -> "Mercury";
            case "kalium" -> "Potassium";
            case "natrium" -> "Sodium";
            case "plumbum" -> "Lead";
            case "stannum" -> "Tin";
            case "stibium" -> "Antimony";
            case "sulphur" -> "Sulfur";
            case "ununquadium" -> "Flerovium";
            case "wolfram" -> "Tungsten";
            default -> name;
        };
    }
}
