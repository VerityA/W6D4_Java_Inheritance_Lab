import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Finn", "909090", 60000.00, "Finance", 1000000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Finn", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("909090", director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(60000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals( 66000.00  , director.raiseSalary(0.10), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(600.00, director.payBonus(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000, director.getBudget(), 0.01);
    }
}
