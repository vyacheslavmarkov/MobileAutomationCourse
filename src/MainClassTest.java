import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    private MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        /* I decided not to add particular values of comparing numbers to the error message,
           because JUnit assertion returns them in case of fail
         */
        Assertions.assertEquals(mainClass.getLocalNumber(), 14,
                "getLocalNumber function returned unexpected number!");
    }
}
