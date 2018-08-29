package e.thread.practice;

public class TimerMain {
    public static void main(String[] args) {
        TimerThread timer = new TimerThread();
        timer.start();
    }
}
