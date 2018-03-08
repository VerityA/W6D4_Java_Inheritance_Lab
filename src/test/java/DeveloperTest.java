import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Graham", "121212", 30000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Graham", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("121212", developer.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals( 33000.00  , developer.raiseSalary(0.10), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.00, developer.payBonus(), 0.01);
    }


}
