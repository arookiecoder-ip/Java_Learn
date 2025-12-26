import java.util.Scanner;

public class jv06_if_statement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        if(age>=18){
            System.out.println("you are an adult");
        }
        else if(age<0){
            System.out.println("you havent born yet!");
        }
        else{
            System.out.println("you are a child!");
        }
        scanner.close();
    }
}
