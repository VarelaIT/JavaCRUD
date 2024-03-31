package PersistanceTests;

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

public class DepartmentPersitenceTest {

    public Connection conn = new DBConn().getConn();

    DepartmentPersitenceTest(){
        TableSchemas.createDepartmentTable(conn);
    }

    @Test
    public void persistingDepartment(){
        IDepartment department = new Department("HHRR", "Human Resoruses.");
        IDepartmentRepository departmentRepository = new DepartmentRepository();

        IPersistedDepartment result = departmentRepository.save(conn, department);

        assertTrue(result.getId() > 0);
    }
}
