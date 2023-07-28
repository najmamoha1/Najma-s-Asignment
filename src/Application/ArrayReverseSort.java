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
// scenario where you have a list of product codes, and you want to sort them in both ascending and 
//descending order to make it easier to manage and search for products
public class ArrayReverseSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Assume we have a list of product codes

        // Create an array of strings named 'productCodes' and initialize it with the provided product codes
        String[] productCodes = {"SKU456", "SKU123", "SKU789", "SKU234"};

        // Print the title "Sorted Product Codes" to indicate that the product codes will be sorted
        System.out.println("Sorted Product Codes:");

        // Sort the 'productCodes' array in ascending order
        Arrays.sort(productCodes);

        // Use a for-each loop to iterate through each product code in the sorted 'productCodes' array
        for (String code : productCodes) {
            // Print each product code with "--" prefix to indicate it's sorted
            System.out.println("--" + code);
        }

        // Print the title "Reverse Sorted Product Codes" to indicate that the product codes will be sorted in reverse order
        System.out.println("Reverse Sorted Product Codes:");

        // Reverse the 'productCodes' array to get it in descending order
        reverseArray(productCodes);

        // Use a for-each loop to iterate through each product code in the reversed 'productCodes' array
        for (String code : productCodes) {
            // Print each product code with "--" prefix to indicate it's in reverse order
            System.out.println("--" + code);
        }
    }

    // Method to reverse an array of strings
    private static void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at 'start' and 'end' indices
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}