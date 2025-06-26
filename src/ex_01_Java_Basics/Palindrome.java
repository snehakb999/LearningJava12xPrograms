package ex_01_Java_Basics;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        boolean check=true;
        input=input.toLowerCase();
        for(int i=0;i<input.length()/2;i++)
        {
            if(input.charAt(i)!=input.charAt(input.length()-1-i)) {
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }


    }
}
//length()
//
//Returns the total number of characters in the string.
//
//Example: "madam" has length() = 5.
//
//length() - 1
//
//Since Java strings are zero-indexed, the last character is at index length() - 1.
//
//Example:
//
//"madam" has indices: 0 (m), 1 (a), 2 (d), 3 (a), 4 (m).
//
//So, length() - 1 = 4 (last index).
//
//length() - 1 - i
//
//As i increases in the loop, this moves from the end towards the start.
//
//Example (for i = 0, 1, 2 in "madam"):
//
//When i = 0: 4 - 0 = 4 (last character 'm').
//
//When i = 1: 4 - 1 = 3 (second-last character 'a').
//
//When i = 2: 4 - 2 = 2 (middle character 'd').