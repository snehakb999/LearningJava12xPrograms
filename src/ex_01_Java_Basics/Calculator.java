package ex_01_Java_Basics;

import java.util.Scanner;

public class Calculator {
    static int getValidInteger(Scanner scanner,String message){
        System.out.println(message);
        if(scanner.hasNextInt()){

          return scanner.nextInt();
        }
        else{
            System.out.println("enter only integer value");
            System.exit(0);
            return -1;
        }
    }
    static int addition(int a, int b){
      int result=a+b;
      return result;
    }
    static int subtraction(int a, int b){
        int result=a-b;
        return result;
    }
    static int multiplication(int a, int b){
        int result=a*b;
        return result;
    }
    static int division(int a, int b){
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }else{
            return a / b;
        }

    }

    public static void main(String[] args) {
        //create functions of sum,div,mul,sub
        //parameter a, b taken from user
        Scanner scanner = new Scanner(System.in);
        int num1 = getValidInteger(scanner, "Enter first integer: ");
        int num2 = getValidInteger(scanner, "Enter second integer: ");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = getValidInteger(scanner, "");
        switch (choice) {
            case 1:
                System.out.println("Result = " + addition(num1, num2));
                break;
            case 2:
                System.out.println("Result = " + subtraction(num1, num2));
                break;
            case 3:
                System.out.println("Result = " + multiplication(num1, num2));
                break;
            case 4:
                System.out.println("Result = " + division(num1, num2));
                break;
            default:
                System.out.println("Invalid choice! Please choose between 1 and 4.");
        }


    }
}
