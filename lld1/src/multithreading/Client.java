package multithreading;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();
//        Thread.sleep(2000);   -> might throw exception
        System.out.println("Hello World from main");
    }
}
//Java starts -> main thread
