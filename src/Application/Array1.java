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

// a scenario involving a limited-time promotion for a product.
public class Array1 {

    public static void main(String[] args) {
        // Assume we have a list of employee IDs and their corresponding departments

        // Create an array of strings named 'employeeIds' and initialize it with the provided employee IDs
        String[] employeeIds = {"HR123", "IT234", "HR345", "SA456", "HR789", "FIN321"};

        // Use a for-each loop to iterate through each item (employee ID) in the 'employeeIds' array
        for (String employeeId : employeeIds) {

            // Check if the current employee ID belongs to the "HR" department
            if (employeeId.startsWith("HR")) {

                // If the employee ID belongs to "HR" department, print it to the console
                System.out.println("Employee ID in 'HR' department: " + employeeId);
            }
        }
    }
}
