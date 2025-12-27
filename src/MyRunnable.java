public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
                return; // Exit if interrupted
            }
        }
        System.out.println("\n[TIME'S UP!]");
    }
}
