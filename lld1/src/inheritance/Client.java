package inheritance;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "John Smith";
        s.address = "city A";
        s.phone = "154896";
        s.email = "john.smith@mail.com";
        s.password = "password";
        s.getDetails();
        s.attendLecture("LLD OOPS");

        TA t = new TA();
        t.id = 2;
        t.name = "John th";
        t.address = "city A";
        t.phone = "154896";
        t.email = "john.smith@mail.com";
        t.password = "password";
        t.getDetails();

        System.out.println();
        System.out.println("---------------------");
        System.out.println(100);
        System.out.println(100.11);
        System.out.println(100.1f);
        System.out.println(true);
        System.out.println("AAA");


        Calculator c = new Calculator();
        c.add(5, 4);
/*
    c.addDecimal(5.4, 4.8);
    c.addDecimalInt(5.9, 6);
*/
        c.add(5.4, 4.8);
        c.add(5.9, 6);


//        METHOD OVERLOADING IS COMPILE TIME POLYMORPHISM AND HAPPENS ONLY IN THE SAME CLASS


//        User[parent] -> Student, TA, mentor, instructor [child classes]
        User uStudent = new Student();
        User uTA = new TA();
        User uMentor = new Mentor();
        User uInstructor = new Instructor();
//        UPCASTING -> object of child class, upcast reference variable of parent class

        ValidationService validationService = new ValidationService();
        System.out.println(validationService.verifyEmail(new Student()));
        System.out.println(validationService.verifyEmail(new TA()));
        System.out.println(validationService.verifyEmail(new Instructor()));
        System.out.println(validationService.verifyEmail(new Mentor()));

        Student student = new Student();
        student.attendLecture();

        Instructor instructor = new Instructor();
        instructor.attendLecture();

        Mentor mentor = new Mentor();
        mentor.attendLecture();

        TA ta = new TA();
        ta.attendLecture();

//        METHOD OVERRIDING always happens in child class and not in same class
//        RUNTIME POLYMORPHISM -> dont know which method will be executed

        C objc = new C(1, 2, 3);
        System.out.println(objc.x);
        System.out.println(objc.y);
        System.out.println(objc.z);
        objc.helloC();
    }
}
//1.Single inheritance
//2.multi-level inheritance
//3.hierarchical inheritance
//4. multiple inheritance => not supported in java (multiple parents)