package homework_week2_maninishethsheth;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4  Call both static and instance variables into both instance and static methods inside print statement
 * 3.5 Declare the main method.
 * Call both instance and static methods into the main method and run the programme.
 */
public class Java_Question3 {
    int a = 10;
    static int A = 20;


    public static void main(String[] args) {
        System.out.println(A);
        Java_Question3 java = new Java_Question3();
        java.myMethod();
    }

    public void myMethod() {
        System.out.println(a);
        System.out.println(Java_Question3.A);

    }

    // static method
    public static void test() {
        System.out.println(A);
        Java_Question3 java = new Java_Question3();
        java.myMethod();

    }
}



