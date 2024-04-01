package ConsoleApp;

import Entities.Employee;
import Persistence.TableSchemas;
import Persistence.EmployeeFileRepository;
import Persistence.IEmployeeRepository;
import Persistence.JDBC.DBConn;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class App {

    public static void main (String[] args) {
        var conn = new DBConn().getConn();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

        //Setting up persistence
        TableSchemas.createDepartmentTable(conn);

        System.out.println("\n\t* This is the JavaCRUD project...\n");

        /*
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1987, 2, 8);

        IEmployeeRepository repository = new EmployeeFileRepository();
        repository.save(new Employee("Ismael", "Varela", birthDate));
         */

        LocalDateTime before = LocalDateTime.now();
        System.out.println("\nExecution begins at " + dtf.format(before));

    }
}
