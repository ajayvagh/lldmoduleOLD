package inheritance;

public class Instructor extends User{
    int noOfLectures;
    double rating;

    public void attendLecture(){
        System.out.println("instructor is teaching lecture");
    }
}
