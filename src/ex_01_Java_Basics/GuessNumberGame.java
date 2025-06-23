package ex_01_Java_Basics;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random=new Random();
        int numberToGuess= random.nextInt(100);

        System.out.println("Hey !!! This is a number guessing game");
        System.out.println("Imagine a number between 1 to 100 and we will guess it :)");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first guess");

        int guess;
        int attempts=0;
        while (true){
            guess=sc.nextInt();
            attempts++;
            if (guess<numberToGuess){
                System.out.println("low value ,guess again");
            } else if (guess>numberToGuess) {
                System.out.println(" high value,guess again");
            }
            else {
                System.out.println("you guessed it in "+attempts+ "attempts");
                break;
            }


        }


    }
}
