import java.util.Scanner;
import java.util.InputMismatchException;

public class jv45_exception_handling {
//    Exception = An event that interrupts the normal flow of a program
//    (Dividing by zero, file not found, mismatch input type)
//    Surround any dangerous code with a try{} block
//    try{}, catch{}, finally{}

    static void main() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter  a number : ");
            int number = scanner.nextInt();
            System.out.println(number);

        } catch (InputMismatchException a) {
            System.out.println("that wasn't a number");
        } catch (Exception e) { // to catch any type of exception
            System.out.println("something went wrong. ");
        } finally {
            System.out.println("this always executes");
        }

    }

}
