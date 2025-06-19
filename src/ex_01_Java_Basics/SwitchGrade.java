package ex_01_Java_Basics;

import java.util.Scanner;

public class SwitchGrade {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String grade=s.next();
        grade=grade.toUpperCase();
        switch (grade){
            case "A" -> System.out.println("excellent");
            case "B" -> System.out.println("Very good");
            case "C" -> System.out.println("Good");
            case "D" -> System.out.println("Needs Improvement");
            case "E" -> System.out.println("Fail");

            default -> System.out.println("Invalid grade");
        }

    }
}
