package ex_01_Java_Basics;

import java.util.Scanner;

public class VariablesAndDatatypes {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter your number please");
        int num=s.nextInt();
        System.out.println("Below is your table for "+num);
        System.out.printf("%d * 1 = %d\n",num,num*1);
        System.out.printf("%d * 2 = %d\n",num,num*2);
        System.out.printf("%d * 3 = %d\n",num,num*3);
        System.out.printf("%d * 4 = %d\n",num,num*4);
        System.out.printf("%d * 5 = %d\n",num,num*5);
        System.out.printf("%d * 6 = %d\n",num,num*6);
        System.out.printf("%d * 7 = %d\n",num,num*7);
        System.out.printf("%d * 8 = %d\n",num,num*8);
        System.out.printf("%d * 9 = %d\n",num,num*9);
        System.out.printf("%d * 10 = %d\n",num,num*10);


    }
}
