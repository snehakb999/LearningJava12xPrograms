package ex_01_Java_Basics;

import java.util.Scanner;

public class SwitchLeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter year");
        int year=s.nextInt();
        System.out.println("Enter month number (1 to 12):");
        int month=s.nextInt();
        boolean leap=((year%4==0&&year%100!=0)||year%400==0);

        switch(month){
            case 1-> System.out.println("january has 31 days");
            case 3-> System.out.println("march has 31 days");
            case 4-> System.out.println("april has 30 days");
            case 5-> System.out.println("may has 31 days");
            case 6-> System.out.println("june has 30 days");
            case 7-> System.out.println("july has 31 days");
            case 8-> System.out.println("august has 31 days");
            case 9-> System.out.println("september has 30 days");
            case 10-> System.out.println("october has 31 days");
            case 11-> System.out.println("november has 30 days");
            case 12-> System.out.println("december has 31 days");
            case 2->{
                if(leap)
            {
                System.out.println("february has 29 days");
            }
            else {
                System.out.println("february has 28 days");
            }
            }


            default -> System.out.println("enter valid number between 1 to 12");
        }
        if(leap){
            System.out.println(year+ " is a leap year");
        }
        else {
            System.out.println(year+ " is not a leap year");
        }



    }
}
