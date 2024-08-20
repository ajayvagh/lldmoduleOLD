package Syncronisation;

import java.util.concurrent.locks.ReentrantLock;

public class Count {
    private int value = 0;

   // private final Lock lock1 = new ReentrantLock();      // Mutex lock

    public synchronized void increment(){
//        lock.lock();
        value++;
//        lock.unlock();
    }

    public int getValue(){
        return value;
    }
}
