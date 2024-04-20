package homework_week2_maninishethsheth;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Java_Question4 {
    int a = 10;
    String name = "Girl";
    static int A = 13;
    static String like = "Boy";

    public static void main(String[] args) {
        Java_Question4 obj = new Java_Question4();
        obj.myAnswer();//a=10,name="Manini"
        car();
    }

    //instance method
    public void myAnswer() {
        System.out.println(a);
        System.out.println(name);
        Java_Question4 obj = new Java_Question4();
        System.out.println(obj.A);//A=13
        System.out.println(obj.like);//like="Boy"
    }

    //static method

    public static void car() {
        System.out.println(A);
        System.out.println(like);
        Java_Question4 tyre = new Java_Question4();
        System.out.println(tyre.a);
        System.out.println(tyre.name);


    }
}



