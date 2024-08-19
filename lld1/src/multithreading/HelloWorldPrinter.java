package multithreading;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World is running from thread :" + Thread.currentThread().getName());
    }
}
