//Hii this a small java game program made by me - "Shubham Kumar", hope you like it..

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Guess the Number game!");
        System.out
                .println("I've selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                score += (maxAttempts - attempts) * 10;
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        System.out.println("Your score is: " + score);
        scanner.close();
    }
}
