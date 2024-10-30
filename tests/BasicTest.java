import org.junit.Test;
import static org.junit.Assert.*;

public class BasicTest {

    @Test
    public void testAssert() {
        int result = 2;

        assertEquals(2, result);
        System.out.println("Test worked");
    }
}