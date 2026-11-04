import java.util.Timer;
import java.util.TimerTask;

public class Timers {

    public static void main(String[] args){


        Timer timer = new Timer();
        TimerTask timertask = new TimerTask() {
            int count = 5;

            @Override
            public void run() {
                System.out.println("Hellow");

                count--;
                if (count <= 0){
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };


        timer.schedule(timertask, 0, 1000);
    }
}
