package homework_week2_maninishethsheth;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Java_Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input two binary numbers
        System.out.print("Input first binary number: ");
        String binary1 = scanner.next();

        System.out.print("Input second binary number: ");
        String binary2 = scanner.next();

        // Perform binary addition
        String sum = addBinary(binary1, binary2);

        // Display the result
        System.out.println("Sum of two binary numbers: " + sum);

        scanner.close();
    }

    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = binary1.length() - 1;
        int j = binary2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? binary1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? binary2.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }
}

