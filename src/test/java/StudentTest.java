import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void TestForStudentClass(){
        // STUDENT AS NULL CASE
        Student vasya = null;
        assertNull(vasya);
        // STUDENT WITH CONSTRUCTOR CASE
        Student alex = new Student("alex", 1);
        assertNotNull(alex);
        assertNotEquals(null, alex);
    }

    @Test
    public void TestForGetNameMethod(){
        Student alex = new Student("Alex", 1);
        assertEquals("Alex", alex.getName());
        assertSame("Alex", alex.getName());
        Student vasya = new Student("Vasya", 2);
        assertEquals("Alex", alex.getName());
        assertSame("Alex", alex.getName());
        Student rhaegar = new Student("Rhaegar", 3);
        assertNotEquals("Vasya", rhaegar.getName());
        assertNotEquals("Alex", rhaegar.getName());
    }

    @Test
    public void TestForGetIdMethod(){
        Student alex = new Student("Alex", 1);
        assertEquals(1, alex.getId());
        Student vasya = new Student("Vasya", 2);
        assertEquals(2, vasya.getId());
        Student rhaegar = new Student("Rhaegar", 3);
        assertNotEquals(2, rhaegar.getId());
        assertNotEquals(1, rhaegar.getId());
    }
}
