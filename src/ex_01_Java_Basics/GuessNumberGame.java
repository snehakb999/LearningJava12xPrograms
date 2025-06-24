package ex_01_Java_Basics;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random=new Random();
        int numberToGuess= random.nextInt(100);

        System.out.println("Hey !!! This is a number guessing game");
        System.out.println("Imagine a number between 1 to 100 and we will guess it (enter -1 to quit the game):)");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first guess");

        int guess;
        int attempts=0;


            while (true) {
                guess = sc.nextInt();


                if (guess == -1) {
                    System.out.println("👋 You chose to quit. The correct number was: " + numberToGuess);
                    break;
                }
                if (guess < 1 || guess > 100) {
                    System.out.println("⚠️ Please enter a number between 1 and 100.");
                    continue;
                }
                attempts++;




                if (guess < numberToGuess) {
                    System.out.println("low value ,guess again");
                } else if (guess > numberToGuess) {
                    System.out.println(" high value,guess again");
                } else {
                    System.out.println("you guessed it in " + attempts + " attempts");
                    break;
                }

        }



    }
}
