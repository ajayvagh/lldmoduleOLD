package interfacesandabstract;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    int speed;
    int price;

    public Car(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }
    @Override
    public int compareTo(Car c) {
        return this.price - c.price;
    }

    @Override
    public String toString() {
        return "Car{" + "speed=" + speed + ", price=" + price + '}';
    }
}
