package ex_01_Java_Basics;

import java.util.Scanner;

public class NestedTernary2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age");
        int age=s.nextInt();
        String result=(age>18)?(age<65?"adult":"senior"):(age<18?"minor":"adult");
        System.out.println("you are an "+result);



    }
}
