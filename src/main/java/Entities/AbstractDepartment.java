package Entities;

public class AbstractDepartment {
    protected int id;
    protected String name;
    protected String description;

    AbstractDepartment(String name, String description){
        this.name = name;
        this.description = description;
    }
}
