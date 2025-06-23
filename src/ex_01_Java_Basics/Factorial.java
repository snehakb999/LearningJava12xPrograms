package ex_01_Java_Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to find factorial");
        int num=s.nextInt();
        int fact=1;
        if(num<0){
            System.out.println("factorial for negative numbers cannot be found");
        }
        else {


            for (int i = 1; i <= num; i++) {
                fact = fact * i;

            }
            System.out.println("The factorial of " + num + " is =" + fact);
        }
    }
}
