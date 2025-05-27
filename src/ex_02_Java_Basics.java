import java.util.Scanner;
public class ex_02_Java_Basics {

        public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            System.out.print("Enter your name: ");
            // Read a line of text entered by the user
            String name = scanner.nextLine();
            // Prompt the user for a number
            System.out.print("Enter your age: ");
            // Read an integer entered by the user
            int age = scanner.nextInt();
            // Display the user's input
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
            // Close the Scanner to release resources (optional)
            scanner.close();
        }



}
