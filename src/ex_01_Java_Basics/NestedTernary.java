package ex_01_Java_Basics;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numbers");
        int  n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        int result=(n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println("the maximum is "+result);


    }
}
