package multithreading;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();
//      start creates a new thread

//        t.run();
//       runs in main method

//       Thread.sleep(2000);   -> might throw exception
        System.out.println("Hello World from main :" + Thread.currentThread().getName());

        Adder adder = new Adder(10, 20);
        Thread t1 = new Thread(adder);
        t.start();


    }
}
/*
Java starts -> main thread
Debugging is difficult in multithreading
*/
