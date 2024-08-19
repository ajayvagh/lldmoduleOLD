package interfacesandabstract;

public abstract class Bird {
    int noOfLegs;
    int noOfWings;

    public abstract void eat();

    public void sleep(){
        System.out.println("bird is sleeping");
    }
    public void breathe(){
        System.out.println("bird is breathing");
    }
}
