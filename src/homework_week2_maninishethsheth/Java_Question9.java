package homework_week2_maninishethsheth;

import java.util.Scanner;

// Write a program to convert the upper case to lower case
public class Java_Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string in uppercase
        System.out.print("Enter a string in uppercase: ");
        String uppercaseString = scanner.nextLine();

        // Convert to lowercase
        String lowercaseString = convertToLowercase(uppercaseString);

        // Display the result
        System.out.println("The string in lowercase is: " + lowercaseString);

        scanner.close();
    }

    public static String convertToLowercase(String uppercaseString) {
        // Using the toLowerCase() method of the String class
        return uppercaseString.toLowerCase();
    }
}

