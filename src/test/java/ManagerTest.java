import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Verity", "9876543", 40000, "IT");
    }


    @Test
    public void canGetName() {
        assertEquals("Verity", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("9876543", manager.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals( 44000.00  , manager.raiseSalary(0.10), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, manager.payBonus(), 0.01);
    }

   @Test
    public void canGetDeptName() {
        assertEquals("IT", manager.getDeptName());
   }

}
