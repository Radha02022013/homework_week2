package homework_week2_maninishethsheth;

import java.util.Scanner;

//Write a program to calculate the area of a triangle.
public class Java_Question8 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter base and height
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate area
        double area = calculateArea(base, height);

        // Display the result
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);

        scanner.close();
    }

    public static double calculateArea(double base, double height) {
        // Formula for area of a triangle: A = 0.5 * base * height
        return 0.5 * base * height;
    }
}

