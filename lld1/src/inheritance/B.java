package inheritance;

public class B extends A {
    int y;

    public B (int x, int y){
        super(x);
        this.y = y;
    }

    public void helloB(){
        System.out.println("Hello from B");
    }


}
