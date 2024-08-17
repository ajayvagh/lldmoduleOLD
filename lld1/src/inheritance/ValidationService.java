package inheritance;

public class ValidationService {

    public boolean verifyEmail(User user) {
        String email = user.email;

        if (email == null) return false;
        else return true;
    }
/*
accepts a type of user referance variable, since upcasting is possible
    all the child objects of user can be upcasted to a user referance variable
    hence we can use all objects of user for this method as well
    ---------------------------------------------------------------
    public boolean verifyEmailStudent(Student student) {
        String email = student.email;

        if (email == null) return false;
        else return true;
    }

    public boolean verifyEmailTA(TA ta) {
        String email = ta.email;

        if (email == null) return false;
        else return true;
    }
*/

    public void validateLectureAttendance(User user) {
        user.attendLecture();
        System.out.println("User has attended lecture");
    }

}
