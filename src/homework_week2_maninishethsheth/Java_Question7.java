package homework_week2_maninishethsheth;
//Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).


import java.util.Scanner;


public class Java_Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius (1)");
        int result = scan.nextInt();
        if (result == 1) {
            System.out.println("Enter Fahrenheit Value:");
            double value = scan.nextDouble();
            double valueFinal = (value - 32) * 5 / 9;
            System.out.println("Celsius is: ");
            System.out.println(Math.round(valueFinal));
            scan.close();
        }
    }
}


