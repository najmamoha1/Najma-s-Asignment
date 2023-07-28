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

//a list of employee names, and you want to create email
//addresses for each employee based on their names:
public class EmailAddressGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Assume we have a list of employee names

        // Create a string 'employeeNames' representing the list of employee names
        String employeeNames = "NAJMA MOHA KHALIF ALI NOOR";

        // Split the employee names into individual names using space as the separator
        String[] names = employeeNames.split(" ");

        // Loop through each employee name (substring) in the 'names' array
        for (String name : names) {
            // Convert the employee name (substring) into an array of characters
            char[] value = name.toCharArray();

            // Reverse the characters in the 'value' array using the 'reverseArray' method
            reverseArray(value);

            // Convert the reversed characters to lowercase to create the username for the email
            String username = new String(value).toLowerCase();

            // Create the email address by appending the domain name to the username
            String emailAddress = username + "@company.com";

            // Print the email address for the employee
            System.out.println("Email address for " + name + ": " + emailAddress);
        }
    }

    // Method to reverse an array of characters
    private static void reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at 'start' and 'end' indices
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}