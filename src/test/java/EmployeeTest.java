import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;
//
//    @Before
//    public void before() {
//        employee = new Employee("Natacha", "1234567", 28000);
//        }

    @Test
    public void canGetName() {
        assertEquals("Natacha", employee.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("1234567", employee.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(28000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals( 30800.00  ,employee.raiseSalary(0.10), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(280.00, employee.payBonus(), 0.01);
    }

}
