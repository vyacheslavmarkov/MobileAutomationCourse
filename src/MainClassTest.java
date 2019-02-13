import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    private MainClass mainClass = new MainClass();

    // Test 1
    @Test
    public void testGetLocalNumber() {
        /* I decided not to add particular values of comparing numbers to the error message,
           because JUnit assertion returns them in case of fail
         */
        Assertions.assertEquals(mainClass.getLocalNumber(), 14,
                "getLocalNumber function returned unexpected number!");
    }

    // Test 2
    @Test
    public void testGetClassNumber() {
        Assertions.assertTrue(mainClass.getClassNumber() > 45,
                "getClassNumber returned value that is smaller than 45!" +
                        "\nThe value is " + mainClass.getClassNumber());
    }
}
