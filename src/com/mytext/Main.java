/**
 *  Java program to replace character 'k' with a 'V'.
 */

package com.mytext;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Text.
        String text = "The home of football across the globe, FIFA bring you the very latest tournament news, player" +
                " exclusives and live match content all in one place.";

        // Printing original text.
        System.out.println(text);
        // Moderated text.
        String newText = text.replace('o', 'V');

        // Printing moderated text.
        System.out.println(newText); // Output: The hVme Vf fVVtball acrVss the glVbe, FIFA bring yVu the very latest
        // tVurnament news, player exclusives and live match cVntent all in Vne place.

    }
}