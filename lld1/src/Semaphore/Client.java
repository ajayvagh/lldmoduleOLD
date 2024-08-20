package Semaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue< Shirt > store  = new LinkedList<>();
        int maxSizeOfStore = 4;

        Semaphore semaForProducer = new Semaphore(maxSizeOfStore);
        Semaphore semaForConsumer = new Semaphore(0);

        Producer p1 = new Producer(store, maxSizeOfStore, "P1", semaForProducer, semaForConsumer);
        Producer p2 = new Producer(store, maxSizeOfStore, "P2", semaForProducer, semaForConsumer);
        Producer p3 = new Producer(store, maxSizeOfStore, "P3", semaForProducer, semaForConsumer);
        Producer p4 = new Producer(store, maxSizeOfStore, "P4", semaForProducer, semaForConsumer);

        Consumer C1 = new Consumer(store, maxSizeOfStore, "C1", semaForProducer, semaForConsumer);
        Consumer C2 = new Consumer(store, maxSizeOfStore, "C2", semaForProducer, semaForConsumer);
        Consumer C3 = new Consumer(store, maxSizeOfStore, "C3", semaForProducer, semaForConsumer);
        Consumer C4 = new Consumer(store, maxSizeOfStore, "C4", semaForProducer, semaForConsumer);

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();

        new Thread(C1).start();
        new Thread(C2).start();
        new Thread(C3).start();
        new Thread(C4).start();

    }
}
