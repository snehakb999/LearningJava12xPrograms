package ex_01_Java_Basics;

import java.util.Scanner;

public class Prime{
    static boolean Isprime(int num){
        if(num<=1){
           return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if (num % i == 0) {
                    return false; // Found a divisor, not prime
                }

            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if(Isprime(number))
        {
            System.out.println("Prime number");
        }
        else
            System.out.println("Not a prime number");


    }
}
