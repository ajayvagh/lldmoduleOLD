package constructorandstatic;

public class Department {
    int id;
    String name;
    int budget;
    int numberOfEmployees;;
    int startingYear;
    String companyName;
    String ceo;

    public Department(Department department){
        id = department.id +1;
        name = department.name;
        budget = department.budget;
        numberOfEmployees = department.numberOfEmployees;
        startingYear = department.startingYear;
        companyName = department.companyName;
        ceo = department.ceo;
    }
}
