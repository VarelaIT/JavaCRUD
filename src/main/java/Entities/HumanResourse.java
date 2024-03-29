package Entities;

import java.util.Date;

abstract class HumanResourse {

    protected int id;
    public String name;
    public String lastName;
    public Date birthDate;

    public HumanResourse(String name, String lastName, Date birhtDate){
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birhtDate;
    }

}
