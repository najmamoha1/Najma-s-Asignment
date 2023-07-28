/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    
    // scenario where we want to generate unique order IDs for a batch of orders in an online store
    public static void main(String[] args) {
        // Generate unique order IDs for a batch of orders

        // Create a Random object to generate random values
        Random random = new Random();

        // Create an array of strings named 'orderIDs' to store the generated order IDs
        String[] orderIDs = new String[5];

        // Generate unique order IDs and store them in the 'orderIDs' array
        for (int i = 0; i < orderIDs.length; i++) {
            // Generate a random ASCII value between 65 and 70 to represent a prefix character ('A' to 'F')
            int prefixValue = random.nextInt(6) + 65;

            // Convert the ASCII value to a character (prefix character)
            char prefixChar = (char) prefixValue;

            // Convert the prefix character to a string
            String prefix = String.valueOf(prefixChar);

            // Generate a random 3-digit number as the suffix for the order ID
            String suffix = String.format("%03d", random.nextInt(1000));

            // Combine the prefix and suffix to form the complete order ID
            orderIDs[i] = prefix + suffix;
        }

        // Display the generated order IDs
        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }
}