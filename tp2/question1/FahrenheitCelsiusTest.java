package question1;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class FahrenheitCelsiusTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FahrenheitCelsiusTest
{
    /**
     * Default constructor for test class FahrenheitCelsiusTest
     */
    public FahrenheitCelsiusTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void Test100()
    {
        assertEquals(37.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
    }

    @Test
    public void TestValues()
    {
        assertEquals(-17.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(0), 0.1);
        assertEquals(37.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
        assertEquals(1096.6, question1.FahrenheitCelsius.fahrenheitEnCelsius(2006), 0.1);
    }
}


