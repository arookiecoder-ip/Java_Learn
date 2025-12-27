import java.util.Scanner;

public class jv54_threading {


//    Threading = Allows a program to run multiple tasks simultaneously
//    Helps improve performance with time-consuming operations
//    (File I/0, network communications, or any background tasks)

// How to create a Thread
// Option 1. Extend the Thread class (simpler)
// Option 2. Implement the Runnable interface (better)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("you have 5 sec to enter your name");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        System.out.println(" enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);


        scanner.close();

    }


}
