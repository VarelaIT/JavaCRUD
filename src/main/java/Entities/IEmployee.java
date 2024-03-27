package Entities;

import java.util.Date;

public interface IEmployee {
    void setDepartment(int id);
    int getDepartment();
    void setName(String name);
    String getName();
    void setLastName(String lastName);
    String getLastName();
    void setBirthDate(Date bd);
    Date getBirthDate();
}
