package Entities;

import java.util.Date;

public interface IEmployee {
    void setId(int index);
    int getId();
    void setName(String name);
    String getName();
    void setLastName(String lastName);
    String getLastName();
    void setBirthDate(Date bd);
    Date getBirthDate();
    void setDepartmentID(int id);

    void setDepartment(int id);

    int getDepartment();
}
