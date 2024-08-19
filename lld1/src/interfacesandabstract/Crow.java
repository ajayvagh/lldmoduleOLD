package interfacesandabstract;

public class Crow extends Bird implements IFlyable{

    public void eat(){
        System.out.println("Crow is eating");
    }

    public void fly(){
        System.out.println("Crow is flying");
    }
}
