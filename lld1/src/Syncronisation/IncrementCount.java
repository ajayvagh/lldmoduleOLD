package Syncronisation;

public class IncrementCount implements Runnable{

    private Count count;

    public IncrementCount(Count count) {
        this.count = count;
    }

    public void run() {
        for(int i = 0; i < 1000; i++){
            count.increment();
        }
    }
}
