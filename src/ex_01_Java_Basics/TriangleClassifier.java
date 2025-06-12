package ex_01_Java_Basics;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter your sides of the triangle");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a==b&&b==c)
        {
            System.out.println("your triangle is an equilateral triangle");
        } else if (a==b||b==c||a==c) {
            System.out.println("your triangle is an isosceles triangle");

        }
        else {
            System.out.println("your triangle is a scalene triangle");
        }

    }
}
