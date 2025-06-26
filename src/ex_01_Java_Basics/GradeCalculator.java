package ex_01_Java_Basics;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numerical score (out of 100): ");
        double score = scanner.nextDouble();

        char grade;
        if(score<0||score>100) {
            System.out.println("Invalid score");
            return;
        }
        else {
            if (score >= 90)
                grade = 'A';
            else if (score >= 80)
                grade = 'B';
            else if (score >= 70)
                grade = 'c';
            else if (score >= 60)
                grade = 'D';
            else
                grade = 'E';
        }
        System.out.println("Your letter grade is: " + grade);


    }
}
