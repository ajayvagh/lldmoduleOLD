package interfacesandabstract;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
    public static void main(String[] args) {
        ArrayList < Bird > birds = new ArrayList<>();
        birds.add(new Crow());
        birds.add(new Sparrow());
        birds.add(new Penguin());

        for (Bird b : birds) {
            b.breathe();
        }

        ArrayList < IFlyable > flyableBirds = new ArrayList<>();
        flyableBirds.add(new Crow());
        flyableBirds.add(new Sparrow());

        for(IFlyable b : flyableBirds) {
            b.fly();
        }

        ArrayList < Car > cars = new ArrayList<>();
        cars.add(new Car(100, 100000));
        cars.add(new Car(200, 150000));
        cars.add(new Car(50, 70000));
        cars.add(new Car(250, 20000));
        cars.add(new Car(120, 110000));

        System.out.println(cars);

        Collections.sort(cars);
        System.out.println(cars);

    }
}
//can't create objects of abstract class
//abstract classes have constructors
