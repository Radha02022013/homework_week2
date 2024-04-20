package homework_week2_maninishethsheth;

import java.util.Scanner;

// Q6. Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
public class Java_Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area
        double area = calculateArea(radius);

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }

    public static double calculateArea(double radius) {
        // Formula for area of a circle: A = PI * r * r
        return Math.PI * radius * radius;


    }
}

