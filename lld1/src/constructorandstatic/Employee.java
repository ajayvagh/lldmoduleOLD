package constructorandstatic;

public class Employee {
    String name;    //default string value is null
    int salary;     //default value of int is 0

//    when we don't add any constuctor, java creates default constructor with all data members as default values
    /*public Employee(){

    } <- default constuctor  */

    public Employee(){          //NO-arguement constructor
        name = "ajay";
        salary = 15000;
    }       //can have some fixed value for the attributes, every object will be created with those value

    public Employee(String employeeName, int employeeSalary){
        name = employeeName;
        salary = employeeSalary;
    }       // <- parameterised constuctor, can pass values for some or all attributes



}
