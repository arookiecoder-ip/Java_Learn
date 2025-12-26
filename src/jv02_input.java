import java.util.Scanner;

public class jv02_input {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = scanner.next(); //for string
        scanner.nextLine();  //to fix the multiple input line buffer
        System.out.println("hello "+ name +"\n");

        System.out.println("enter your age: ");
        int age =scanner.nextInt();  //for integer
        System.out.println("hello ,your age is :  " + age+"\n");

        System.out.println("what is your gpa");
        double gpa =scanner.nextDouble(); //for decimal integer
        System.out.println("your gpa is : "+gpa +"\n");

        System.out.println("are u a student?(true/false)");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("student:"+isStudent);   //for boolean


        scanner.close();

    }

}
