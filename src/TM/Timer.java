package TM;

public class Timer {
    long startTime;
    long stopTime;

    public Timer(){
        this.start();
    }
    public void start(){
         startTime = System.currentTimeMillis();
    }

    public void stop(){
        stopTime = System.currentTimeMillis();
    }

    public long elapsedTime(){
        return stopTime - startTime;
    }
}
