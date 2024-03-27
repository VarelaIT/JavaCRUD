package Entities;

import java.util.Date;

public class Employee {

    public String name;
    public String lastName;
    public Date birthDate;

    public Employee(String name, String lastName, Date birhtDate){
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birhtDate;
    }

}
