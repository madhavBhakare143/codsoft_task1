package com.codsoftintern;


import java.util.Scanner;
import java.util.Random;

    public class NumberGame {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            boolean playAgain = true;
            int score = 0;

            while (playAgain) {
                System.out.println("WELCOME TO THE NUMBER GAME!");
                int targetNumber = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
                int attempts = 0;
                boolean CorrectlyGuessed = false;
                final int MAXIMUM_ATTEMPTS = 7; // Limit the number of attempts

                while (!CorrectlyGuessed && attempts < MAXIMUM_ATTEMPTS) {
                    System.out.print("Enter Any Guessed number (1-100): ");
                    int Guessed = sc.nextInt();
                    attempts++;

                    if (Guessed == targetNumber) {
                        System.out.println("Very congrats!, you guessed a correct number! SUCCESSFULLY FOUND");
                        CorrectlyGuessed = true;
                        score += MAXIMUM_ATTEMPTS - attempts + 1; // Score based on attempts taken
                    } else if (Guessed < targetNumber) {
                        System.out.println("Too MUCH low!  Please Try again.");
                    } else {
                        System.out.println("Too MUCH high! Please Try again.");
                    }
                }

                if (!CorrectlyGuessed ) {
                    System.out.println("EXTREMELY SORRY , you've run out of attempts. SO,The correct number was: " + targetNumber);
                }

                System.out.println("Your Game Score is: " + score);
                System.out.print("Do you want to play again? (yes/no): ");
                String userDecision = sc.next();
                playAgain =userDecision.equalsIgnoreCase("yes");
            }

            System.out.println("Thanks for PLAYING this Game!");
            sc.close();
        }
    }



