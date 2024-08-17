package inheritance;

public class Calculator {
    public void add(int a, int b){
        System.out.println(a + b);
    }

//    public void addDecimal(double a, double b){
//        System.out.println(a + b);
//    }
//
//    public void addDecimalInt(double a, int b){
//        System.out.println(a + b);
//    }

    public void add(double a, double b){
        System.out.println(a + b);
    }
//    METHOD OVERLOADING
    public void add(double a, int b) {
        System.out.println(a + b);
    }


}
