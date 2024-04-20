package homework_week2_maninishethsheth;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables in to the static method inside the print statement
 * 2.4 Declare the main method
 * 2.5 Call the static method into the main method and run the programme
 */

public class Java_Question2 {
    static int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        myName();
    }

    //static method
    public static void myName() {
        System.out.println(a);
        System.out.println(b);

    }


}
