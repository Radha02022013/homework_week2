package homework_week2_maninishethsheth;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 * Arithmetic operators:* Multiplication , /Division , + Addition , - Subtraction
 */
public class Java_Question5 {

    // Static methods

    public static String add(double num1, double num2) {
        double result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public static String subtract(double num1, double num2) {
        double result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    // Instance methods

    public String multiply(double num1, double num2) {
        double result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(double num1, double num2) {
        if (num2 == 0) {
            return "Cannot divide by zero";
        } else {
            double result = num1 / num2;
            return num1 + " / " + num2 + " = " + result;
        }
    }

    public static void main(String[] args) {
        // Static method calls
        System.out.println("Addition: " + Java_Question5.add(5, 3));
        System.out.println("Subtraction: " + Java_Question5.subtract(10, 4));

        Java_Question5 calculator = new Java_Question5();
        System.out.println("Multiplication: " + calculator.multiply(6, 2));
        System.out.println("Division: " + calculator.divide(8, 2));
    }
}


