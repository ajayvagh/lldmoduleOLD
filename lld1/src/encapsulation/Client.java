package encapsulation;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.marks = 100;
        s.name = "Ajay";

        System.out.println(s.id);
        System.out.println(s.marks);
        System.out.println(s.name);
    }
}
