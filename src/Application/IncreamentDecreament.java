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
// demonstrates various possibilities of using a counter in Java
   public class IncreamentDecreament {

    // Class-level counter variable
    private static int counter = 0;

    public static void main(String[] args) {
        // Simulate some actions, incrementing the counter
        performAction();
        performAction();
        performAction();

        // Display the final value of the counter
        System.out.println("Final Counter Value: " + counter);
    }

    // Method to perform an action and increment the counter
    public static void performAction() {
        // Increment the counter
        counter++;
        System.out.println("Action performed. Counter is now: " + counter);
    }
}

