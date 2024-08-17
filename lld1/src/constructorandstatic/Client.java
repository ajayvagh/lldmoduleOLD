package constructorandstatic;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee();

        System.out.println(e.name);
        System.out.println(e.salary);

        e.name = "Ajay";
        e.salary = 20000;

        System.out.println(e.name);
        System.out.println(e.salary);

        Employee e1 = new Employee("vagh", 100500);
        System.out.println(e1.name);
        System.out.println(e1.salary);


//        copy constructor
    }
}
