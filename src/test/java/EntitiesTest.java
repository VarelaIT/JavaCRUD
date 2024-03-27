import Entities.Employee;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;

public class EntitiesTest {

    @Test
    public void createEmploy(){
        var name = "Ismael";
        var lastName = "Varela";
        var birthDate = new Date("1987-2-8");

        var newEmploy = new Employee(name, lastName,  birthDate);

        assertTrue(newEmploy.name == name);
        assertTrue(newEmploy.latName == lastName);
        assertTrue(newEmploy.birthDate == birthDate);
    }
}
