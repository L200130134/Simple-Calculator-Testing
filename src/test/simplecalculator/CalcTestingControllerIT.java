package simplecalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User-PRO
 */
public class CalcTestingControllerIT {
    
    public CalcTestingControllerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isNumeric method, of class CalcTestingController.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("Cek bilangan numerik atau bukan");
        String string = "1,34";
        boolean expResult = true;
        boolean result = CalcTestingController.isNumeric(string);
        assertEquals(expResult, result);
    }

    /**
     * Test of testParseToDecimal method, of class CalcTestingController.
     */
    @Test
    public void testParseToDecimal() {
        System.out.println("Konversi bilangan ke desimal");
        String input = "13.4";
        CalcTestingController instance = new CalcTestingController();
        double expResult = 13.4;
        double result = instance.parseToDecimal(input);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of plusNumber method, of class CalcTestingController.
     */
    @Test
    public void testPlusNumber() {
        System.out.println("Penjumlahan");
        double a = 6.2;
        double b = 5.0;
        CalcTestingController instance = new CalcTestingController();
        double expResult = 16.2;
        double result = instance.plusNumber(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of minusNumber method, of class CalcTestingController.
     */
    @Test
    public void testMinusNumber() {
        System.out.println("Pengurangan");
        double a = 6.0;
        double b = 5.0;
        CalcTestingController instance = new CalcTestingController();
        double expResult = 0.0;
        double result = instance.minusNumber(a, b);
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of timesNumber method, of class CalcTestingController.
     */
    @Test
    public void testTimesNumber() {
        System.out.println("Perkalian");
        double a = 0.0;
        double b = 0.0;
        CalcTestingController instance = new CalcTestingController();
        double expResult = 0.0;
        double result = instance.timesNumber(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dividedNumber method, of class CalcTestingController.
     */
    @Test
    public void testDividedNumber() {
        System.out.println("Pembagian");
        double a = 0.0;
        double b = 1.0;
        CalcTestingController instance = new CalcTestingController();
        double expResult = 0.0;
        double result = instance.dividedNumber(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
}
