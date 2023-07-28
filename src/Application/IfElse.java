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
// a scenario involving a limited-time promotion for a product.
public class IfElse {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // Simulate a limited-time product promotion

        // Create a random number generator to get the days until promotion ends
        Random random = new Random();
        int daysUntilPromotionEnds = random.nextInt(14) + 1; // Assuming promotion lasts for up to 14 days
        int discountPercentage = 0;

        // Determine the discount percentage based on the days until promotion ends
        if (daysUntilPromotionEnds == 1) {
            discountPercentage = 25; // Offer 25% discount on the last day of the promotion
        } else if (daysUntilPromotionEnds <= 5) {
            discountPercentage = 15; // Offer 15% discount when there are 5 or fewer days left
        } else if (daysUntilPromotionEnds <= 10) {
            discountPercentage = 10; // Offer 10% discount when there are 10 or fewer days left
        }

        // Display the promotion status and reminder message
        if (daysUntilPromotionEnds < 1) {
            System.out.println("The promotion has ended!");
            System.out.println("Stay tuned for future offers and discounts.");
        } else if (daysUntilPromotionEnds == 1) {
            System.out.println("Last day of the promotion!");
            System.out.println("Get " + discountPercentage + "% off on our products!");
        } else if (daysUntilPromotionEnds <= 5) {
            System.out.println("Only " + daysUntilPromotionEnds + " days left in the promotion!");
            System.out.println("Hurry! Get " + discountPercentage + "% off before it ends.");
        } else if (daysUntilPromotionEnds <= 10) {
            System.out.println("Only " + daysUntilPromotionEnds + " days left in the promotion!");
            System.out.println("Don't miss out! Get " + discountPercentage + "% off on selected items.");
        } else {
            System.out.println("The promotion is active.");
            System.out.println("You have " + daysUntilPromotionEnds + " days left to enjoy our discounts.");
            System.out.println("Shop now and save!");
        }
    }
}
