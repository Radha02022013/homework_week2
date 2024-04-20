package homework_week2_maninishethsheth;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 *  Input Data:
 *       Input a Decimal Number : 5
 *  Expected Output
 *    Binary number is: 101
 */
public class Java_Question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        int decimal = scanner.nextInt();

        // Convert decimal to binary
        String binary = convertToBinary(decimal);

        // Display the result
        System.out.println("Binary number is: " + binary);

        scanner.close();
    }

    public static String convertToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();}

}
