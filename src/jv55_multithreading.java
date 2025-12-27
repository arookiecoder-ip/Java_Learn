public class jv55_multithreading {
    static void main() {
//        Multithreading = Enables a program to run multiple threads concurrently
//        (Thread = A set of instructions that run independently)
//        Useful for background tasks or time-consuming operations




        Thread thread = new Thread(new MyRunnable2());
        Thread thread2 = new Thread(new MyRunnable2());

        thread.start();
        thread2.start();


    }
}
