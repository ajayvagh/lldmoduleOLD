package inheritance;

public class Mentor extends User{
    int noOfSessions;
    double rating;

    public void attendLecture(){
        System.out.println("mentor is creating notes from lecture");
    }
}
