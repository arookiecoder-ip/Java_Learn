import java.util.Scanner;

public class jv16_while_loops {
    static void main() {
        Scanner scanner =new Scanner(System.in);

//        String name="";
//
//        while(name.isEmpty()){
//            System.out.println("Enter your name: ");
//            name =scanner.nextLine();
//
//        }
//        System.out.println("hello " + name);

        int age =0;
        do{
            System.out.println("Your age cant be negative");
            System.out.println("Enter your age:" );
            age =scanner.nextInt();
        }while(age <0);
        System.out.println("You are" + age +"years old");

        scanner.close();
    }
}
