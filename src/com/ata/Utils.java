package com.ata;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/**
 * Static utility methods for use with Elements or other classes.
 * @author StephanPeters (speters33w, peterstz)
 */
public class Utils {
    /**
     * Converts Kelvin to Celsius.
     * @param k temperature in degrees Celsius.
     * @return temperature in degrees Celsius.
     */
    public static double kelvinToCelsius(double k){
        if(k == -1) {
            return k;
        } else {
            return k - 273.15F;
        }
    }

    /**
     * Converts Kelvin to Fahrenheit.
     * @param k temperature in degrees Kelvin.
     * @return temperature in degrees Fahrenheit.
     */
    public static double kelvinToFahrenheit(double k){
        if (k == -1) {
            return k;
        } else {
            return (k - 273.15F) * 1.8F + 32;
        }
    }

    /**
     * Converts picometers to angstroms, used as a measure for atomic radii.
     * @param picometers value in picometers.
     * @return value in angstroms.
     */
    public static double picoMetersToAngstroms(double picometers){
        return picometers * .01;
    }

    /**
     * Converts angstroms to picometers, used as a measure for atomic radii.
     * @param angstroms value in angstroms.
     * @return value in picometers.
     */
    public static int angstromsToPicomters(double angstroms){
        return (int) angstroms * 100;
    }

    /**
     * Converts J/(g·C) to J/(kg·K) for specific heat.
     * @param joulesPerGramCelsius J/(g·C)
     * @return J/(kg·K)
     */
    public static double JoulesPerGramCToJoulesPerKilogramK (double joulesPerGramCelsius){
        return joulesPerGramCelsius * 1000;
    }

    /**
     * Converts J/(kg·K) to J/(g·C) for specific heat.
     * @param joulesPerKilogramKelvin J/(kg·K)
     * @return J/(g·C)
     */
    public static double JoulesPerKilogramKToJoulesPerGramC (double joulesPerKilogramKelvin){
        return joulesPerKilogramKelvin * .001;
    }

    /**
     * Makes a string UTF-8 encoded.
     * @param string The string to be encoded.
     * @return The encoded string.
     */
    public static String toUtf8(String string) {
        ByteBuffer buffer = StandardCharsets.UTF_8.encode(string);
        return StandardCharsets.UTF_8.decode(buffer).toString();
    }

    /**
     * Returns the periodic table block of the element.
     * Returns an incorrect block for Lanthanum, use Elements.block(int group, int period) instead.
     * @param group the periodic table group of the element using the IUPAC numbering system (1-18).
     * @return the periodic table block of the element.
     */
    static char getBlock(int group){
        if (group == -1) {
            return 'f';
        }
        if (group >= 13) {
            return 'p';
        } else if (group >= 3){
            return 'd';
        }
        return 's';
    }

    /**
     * Returns the periodic table block of the element.
     * @param group the periodic table group of the element using the IUPAC numbering system (1-18).
     * @param period the periodic table period of the element
     * @return the periodic table block of the element.
     */
    public static char getBlock(int group, int period){
        if (group == -1 || (group == 3 && period == 6)) {
            return 'f';
        }
        if (group >= 13) {
            return 'p';
        } else if (group >= 3){
            return 'd';
        }
        return 's';
    }

    /**
     * <p></p>Returns the periodic table group in Mendeleev format,
     * (I, II, III, IV, V, etc.).
     * Example:<pre>
     * {@code groupToMendeleev(Elements.BR.group())}</pre>
     * will return {@code VII}.</p><p>
     * @param group the integer using the IUPAC numbering system (1-18) group of the element.
     * @return the element group in Mendeleev Roman numeral format.
     */
    public static String groupToMendeleev(int group){
        StringBuilder mendeleev = new StringBuilder();
        if (group > 8) {
            if (group > 10) {
                group -= 10;
            } else {
                group = 8;
            }
        }
        if(group % 5 == 4) {
            mendeleev.append("I");
            group++;
        }
        if (group >= 5){
            mendeleev.append("V");
            group -= 5;
        }
        if (group != 0) {
            mendeleev.append("I".repeat(group));
        }
        return mendeleev.toString();
    }

    /**
     * <p></p>Returns the periodic table group in CAS Roman numeral format,
     * (IA, IIA, IIIB, IVB, VB, etc.).
     * Example:<pre>
     * {@code groupToCAS(Elements.BR.group())}</pre>
     * will return {@code VIIA}.</p><p>
     * @param group the integer using the IUPAC numbering system (1-18) group of the element.
     * @return the element group in CAS Roman numeral format.
     */
    public static String groupToCAS(int group) {
        StringBuilder cas = new StringBuilder(groupToMendeleev(group));
        String ab = "A";
        if (group > 2 && group < 13) {
            ab = "B";
        }
        cas.append(ab);
        return cas.toString();
    }

    /**
     * <p></p>Returns the periodic table group in old IUPAC Roman numeral format,
     * (IA, IIA, IIIA, IVA, VA, etc.).
     * Example:<pre>
     * {@code groupToOldIUPAC(Elements.BR.group())}</pre>
     * will return {@code VIIB}.</p><p>
     * @param group the integer using the new IUPAC numbering system (1-18) group of the element.
     * @return the element group in old IUPAC Roman numeral format.
     */
    public static String groupToOldIUPAC(int group) {
        StringBuilder oldIupac = new StringBuilder(groupToMendeleev(group));
        if (groupToMendeleev(group).equals("VIII")) {
            return "0";
        }
        String ab = "";
        if (group <= 7) {
            ab = "A";
        }
        if (group >= 11) {
            ab = "B";
        }
        oldIupac.append(ab);
        return oldIupac.toString();
    }
}
