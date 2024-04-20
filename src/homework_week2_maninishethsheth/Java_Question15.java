package homework_week2_maninishethsheth;

//Write a Java program to swap two variables.
public class Java_Question15 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

