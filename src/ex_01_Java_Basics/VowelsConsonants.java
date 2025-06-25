package ex_01_Java_Basics;

import java.util.Locale;
import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        System.out.println("Enter the word to be count vowels and consonants");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()) {
            System.out.println("enter string please");
        }
        else {

            String input = sc.nextLine();
            input = input.toLowerCase();
            int vowels = 0, consonants = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch >= 'a' && ch <= 'z') {


                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }

            }

            System.out.println("no of vowels : " + vowels);
            System.out.println("no of consonants :" + consonants);
        }
    }
}
