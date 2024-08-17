package inheritance;

public class Student extends User{

    double psp;
    double attendance;

//    total attributes -> 6[from user] + 2 its own = 8'

    public void attendLecture(String lectureName){
        System.out.println("Student attending lecture : "+lectureName);
    }
//java identifies a method using signature
// method signature => method name + parameter
    public void attendLecture(int lectureNo){
        System.out.println("Student attending lecture : "+lectureNo);
    }

    public void attendLecture(){
        System.out.println("Student is attending lecture");
    }
}
