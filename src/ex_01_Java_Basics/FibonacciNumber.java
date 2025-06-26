package ex_01_Java_Basics;

import java.util.Scanner;

public class FibonacciNumber {

    static int fibno(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int num=scanner.nextInt();
        System.out.println("The fibonacci series are given below ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibno(i) + " ");
        }





    }
}
