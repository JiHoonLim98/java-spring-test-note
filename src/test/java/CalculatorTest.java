import org.junit.jupiter.api.Test;
import sample.Calculator;
import sample.InvalidOperatorException;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @since       2023.07.20
 * @author      jerry
 * @description calculator test
 **********************************************************************************************************************/
public class CalculatorTest {

    @Test
    public void plus(){
        // given
        long num1 = 1;
        String operator = "+";
        long num2 = 2;
        Calculator calculator = new Calculator();
        // when
        long result = calculator.calculate(num1, operator, num2);
        // then
        assertEquals(3, result);
    }

    @Test
    public void minus(){
        // given
        long num1 = 3;
        String operator = "-";
        long num2 = 2;
        Calculator calculator = new Calculator();
        // when
        long result = calculator.calculate(num1, operator, num2);
        // then
        assertEquals(1, result);
    }

    @Test
    public void multiple(){
        // given
        long num1 = 1;
        String operator = "*";
        long num2 = 2;
        Calculator calculator = new Calculator();
        // when
        long result = calculator.calculate(num1, operator, num2);
        // then
        assertEquals(2, result);
    }

    @Test
    public void divide(){
        // given
        long num1 = 1;
        String operator = "/";
        long num2 = 1;
        Calculator calculator = new Calculator();
        // when
        long result = calculator.calculate(num1, operator, num2);
        // then
        assertEquals(1, result);
    }

    @Test
    public void invalidOperator(){
        // given
        long num1 = 1;
        String operator = "3";
        long num2 = 1;
        Calculator calculator = new Calculator();
        // when
        // then
        assertThrows(InvalidOperatorException.class, () -> {
            long result = calculator.calculate(num1, operator, num2);
        });
    }
}
