package homework_week2_maninishethsheth;

public class Java_Question1 {
//declare two instance variable
 int a = 10;
        String name = "Manini";

        public static void main(String[] args) {
            Java_Question1 java_question1 = new Java_Question1();
            System.out.println(java_question1.a);
            System.out.println(java_question1.name);
            java_question1.myMethod(); // other way to write print statement
        }

        // instance method
        void myMethod() {
            System.out.println(a);
            System.out.println(name);
        }
    }

