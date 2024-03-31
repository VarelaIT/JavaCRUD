package Persistence;

import Entities.IDepartment;

import java.sql.Connection;

public interface IDepartmentRepository {
    void save(Connection conn, IDepartment newDepartment);
    IDepartment get(Connection conn, int id);
}
