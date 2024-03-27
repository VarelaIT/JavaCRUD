import Entities.Employee;
import Persistence.EmployeeDBRepository;
import Persistence.EmployeeFileRepository;
import Persistence.IEmployeeRepository;

import java.util.Date;

public class App {

    public static void main (String[] args) {
        System.out.println("\tThis is the JavaCRUD project...\n");

        IEmployeeRepository repository = new EmployeeFileRepository();
        repository.save(new Employee("Ismael", "Varela", new Date()));

    }
}
