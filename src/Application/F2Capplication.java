/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author Lenovo
 */

//checking the weather forecast
public class F2Capplication {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Assume we received the weather forecast, and the temperature is given in Fahrenheit
        int fahrenheit = 86;

        // Convert Fahrenheit to Celsius using the formula: (F - 32) * 5 / 9
        double temperatureCelsius = (fahrenheit - 32.0) * 5.0 / 9.0;

        // Round the Celsius temperature to the nearest whole number
        long roundedCelsius = Math.round(temperatureCelsius);

        // Display the temperature in Celsius to the user
        System.out.println("The temperature is " + roundedCelsius + " degrees Celsius.");
    }
}
