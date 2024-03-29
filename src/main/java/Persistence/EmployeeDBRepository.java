package Persistence;

import Entities.Employee;
import Entities.IEmployee;

public class EmployeeDBRepository implements IEmployeeRepository {

    public void save(Employee employee) {

    }

    @Override
    public void save(IEmployee employee) {

    }

    @Override
    public IEmployee get(int id) {
        return null;
    }
}
