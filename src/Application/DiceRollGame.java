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

//Three dice are rolled, and the values of the individual dice are added up to calculate the total points. Based on the outcome
//of the dice rolls, bonus points are added to the total. If the total points are 15 or more, the player wins; otherwise, they lose the game.
public class DiceRollGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Simulate a dice roll game

        // Create a random number generator for dice rolls
        Random dice = new Random();

        // Roll three dice and get their values
        int roll1 = dice.nextInt(6) + 1;
        int roll2 = dice.nextInt(6) + 1;
        int roll3 = dice.nextInt(6) + 1;

        // Calculate the total sum of the three dice rolls
        int total = roll1 + roll2 + roll3;

        // Display the result of the dice rolls
        System.out.println("Dice roll: " + roll1 + " + " + roll2 + " + " + roll3 + " = " + total);

        // Check for bonus points based on the roll results
        if (roll1 == roll2 && roll2 == roll3) {
            System.out.println("You rolled triples! +6 bonus points to total!");
            total += 6;
        } else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
            System.out.println("You rolled doubles! +2 bonus points to total!");
            total += 2;
        }

        // Check if the player wins or loses based on the total points
        if (total >= 15) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you lose. Try again!");
        }
    }
}
