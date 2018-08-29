package e.thread;

public class VolatileSample extends Thread {
    private volatile double instanceVariable = 0;


    public void setInstanceVariable(double instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public void run() {
        try {
            while (instanceVariable == 0) {
                Thread.sleep(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceVariable);
    }
}
