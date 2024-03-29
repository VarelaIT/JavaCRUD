import Entities.Employee;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.Assert.*;

public class EntitiesTest {

    @Test
    public void createEmploy() throws ParseException {
        var name = "Ismael";
        var lastName = "Varela";
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1987, 2, 8);

        var newEmploy = new Employee(name, lastName,  birthDate);

        assertSame(newEmploy.name, name);
        assertSame(newEmploy.lastName, lastName);
        assertEquals(newEmploy.birthDate.toString(), birthDate.toString());
    }
}
