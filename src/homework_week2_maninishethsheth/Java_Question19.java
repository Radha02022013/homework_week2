package homework_week2_maninishethsheth;

import java.util.Scanner;


public class Java_Question19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = scanner.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        scanner.close();
    }
}

