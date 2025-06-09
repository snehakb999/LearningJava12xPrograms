package ex_01_Java_Basics;

import java.util.Scanner;

public class OperatorsAndTernaryOp {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter your number");
        int num=s.nextInt();

       String result=(num%2==0)?"even":" odd";

        System.out.println("the number is "+result);


    }
}
