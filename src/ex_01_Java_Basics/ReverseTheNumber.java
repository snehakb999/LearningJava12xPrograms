package ex_01_Java_Basics;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        int reversed=0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Number: " + reversed);

        //using while loop
        //while (num != 0) {
        //    int digit = num % 10;
        //    reversed = reversed * 10 + digit;
        //    num = num / 10;
        //}
    }
}
