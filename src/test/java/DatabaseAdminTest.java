import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Amy", "232323", 32000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Amy", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("232323", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(32000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals( 35200.00  , databaseAdmin.raiseSalary(0.10), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(320.00, databaseAdmin.payBonus(), 0.01);
    }


}
