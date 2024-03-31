package PersistanceTests;

import Entities.Department;
import Entities.IDepartment;
import Persistence.JDBC.DBConn;
import Persistence.TableSchemas;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class DepartmentPersitenceTest {

    public Connection conn = new DBConn().getConn();

    DepartmentPersitenceTest(){
        TableSchemas.createDepartmentTable(conn);
    }

    @Test
    public void persistingDepartment(){
        IDepartment department = new Department("HHRR", "Human Resoruses.");


    }
}
