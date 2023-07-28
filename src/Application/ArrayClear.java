/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */

//scenario where you have a list of product identifiers, and you want to process and clear
//the identifiers for specific products that have been sold and delivered to customers
public class ArrayClear {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // Assume we have a list of product identifiers (pallets) for items in stock

        // Create an array of strings named 'pallets' and initialize it with the provided product identifiers
        String[] pallets = {"B14", "A11", "B12", "A13"};

        // Display an empty line for visual separation
        System.out.println("");

        // Print the first element in the 'pallets' array before clearing, converting it to lowercase
        System.out.println("Before: " + pallets[0].toLowerCase());

        // Clear the first 2 elements in the 'pallets' array by replacing them with null values
        Arrays.fill(pallets, 0, 2, null);

        // Check if the first element is not null after clearing
        if (pallets[0] != null) {
            // Print the first element in the 'pallets' array after clearing, converting it to lowercase
            System.out.println("After: " + pallets[0].toLowerCase());
        }

        // Print a message indicating that 2 pallets have been cleared and the remaining count of pallets
        System.out.println("Clearing 2 ... count: " + pallets.length);

        // Use a for-each loop to print the elements in the 'pallets' array after clearing
        for (String pallet : pallets) {
            // Print each element with "--" prefix to indicate it has been cleared (null)
            System.out.println("-- " + pallet);
        }
    }
}
