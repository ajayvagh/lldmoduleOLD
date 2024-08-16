package encapsulation;

public class Student {
    int id;
    int marks;
    String name;

    void printDetails(){
        System.out.println(id);
        System.out.println(marks);
        System.out.println(name);

//        if made public accessable out of package
//        public -> access anywhere
//        private -> access only inside the class
//        default -> access anywhere inside package, nowhere irrespective of child class
    }
}
