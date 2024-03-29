package Entities;

import java.util.Calendar;

public class Employee extends HumanResourse implements IEmployee{
    public int departmentId;
    public Employee(String name, String lastName, Calendar birhtDate) {
        super(name, lastName, birhtDate);
    }

    @Override
    public void setId(int index) {
        id = index;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setBirthDate(Calendar bd) {
        this.birthDate = bd;
    }

    @Override
    public Calendar getBirthDate() {
        return birthDate;
    }

    @Override
    public void setDepartmentID(int id) {

    }

    @Override
    public void setDepartment(int id){
        departmentId = id;
    }

    @Override
    public int getDepartment() {
        return departmentId;
    }

}
