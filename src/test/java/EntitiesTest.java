import Entities.Employee;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class EntitiesTest {

    @Test
    public void createEmploy() throws ParseException {
        var name = "Ismael";
        var lastName = "Varela";
        LocalDate bd = LocalDate.of(1987, 2, 8);
        var birthDate = new Date();

        var newEmploy = new Employee(name, lastName,  birthDate);

        assertSame(newEmploy.name, name);
        assertSame(newEmploy.lastName, lastName);
        assertTrue(newEmploy.birthDate.equals(birthDate));
    }
}
