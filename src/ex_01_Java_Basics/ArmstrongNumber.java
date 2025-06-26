package ex_01_Java_Basics;

import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's Armstrong: ");
        int number = scanner.nextInt();
        if(isArmstrong(number)){
            System.out.println("armstrong number");
        }else{
            System.out.println("not armstrong");
        }

    }
}
