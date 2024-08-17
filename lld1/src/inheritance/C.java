package inheritance;

public class C extends B{
    int z;

    public C(int x, int y, int zval) {
        super(x, y);
        z = zval;
    }

    public void helloC(){
        System.out.println("Hello from C");
        super.helloB();
        helloB();
    }
//    super is always for immediate parent
}
