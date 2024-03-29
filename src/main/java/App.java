import Entities.Employee;
import Persistence.EmployeeDBRepository;
import Persistence.EmployeeFileRepository;
import Persistence.IEmployeeRepository;

import java.util.Calendar;
import java.util.Date;

public class App {

    public static void main (String[] args) {
        System.out.println("\tThis is the JavaCRUD project...\n");

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1987, 2, 8);

        IEmployeeRepository repository = new EmployeeFileRepository();
        repository.save(new Employee("Ismael", "Varela", birthDate));
    }
}
