package PersistenceTests;

import Entities.Department;
import Entities.IDepartment;
import Entities.IPersistedDepartment;
import Persistence.DepartmentRepository;
import Persistence.IDepartmentRepository;
import Persistence.JDBC.DBConn;
import Persistence.TableSchemas;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentPersistenceTest {

    public Connection conn = new DBConn().getConn();
    public IDepartmentRepository departmentRepository;

    DepartmentPersistenceTest(){
        TableSchemas.createTestDepartmentTable(conn);
        departmentRepository = new DepartmentRepository();
        departmentRepository.setInsertionQuery(
                "INSERT INTO test_departments ( name, description) VALUES ( ?, ?) RETURNING id, name, description"
        );
    }

    @Test
    public void persistingNewDepartment(){
        IDepartment department = new Department("HHRR", "Human Resources.");

        IPersistedDepartment result = departmentRepository.save(conn, department);

        assertTrue(result.getId() > 0);
    }
}
