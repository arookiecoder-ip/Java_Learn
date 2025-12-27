import java.util.Timer;
import java.util.TimerTask;

public class jv50_timertasks {

//    Timer = Class that schedules tasks at specific times or periodically
//    Useful for: sending notifications, scheduled updates, repetitive actions
//
//    TimerTask = Represents the task that will be executed by the Timer
//    You will extend the TimerTask class to define your task
//            Create a subclass of TimerTask and Gnvernide pun()

    static void main() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
          @Override
            public void run(){
              System.out.println("hello"); // task
          }
        };
        timer.schedule(task,0,1000);



    }


}
