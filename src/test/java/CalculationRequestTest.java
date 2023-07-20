import org.junit.jupiter.api.Test;
import sample.BadRequestException;
import sample.CalculationRequest;
import sample.InvalidOperatorException;

import static org.junit.jupiter.api.Assertions.*;

class CalculationRequestTest {

    @Test
    public void validNumber(){
        // given
        String[] parts = new String[]{"1", "+", "2"};
        // when
        CalculationRequest calculationRequest = new CalculationRequest(parts);
        // then
        assertEquals(1, calculationRequest.getNum1());
        assertEquals("+", calculationRequest.getOperator());
        assertEquals(2, calculationRequest.getNum2());
    }

    @Test
    public void validNumber2(){
        // given
        String[] parts = new String[]{"123", "+", "123"};
        // when
        CalculationRequest calculationRequest = new CalculationRequest(parts);
        // then
        assertEquals(123, calculationRequest.getNum1());
        assertEquals("+", calculationRequest.getOperator());
        assertEquals(123, calculationRequest.getNum2());
    }

    @Test
    public void invalidOperator(){
        // given
        String[] parts = new String[]{"123", "+-", "123"};
        // when
        // then
        assertThrows(InvalidOperatorException.class, () ->{
            new CalculationRequest(parts);
        });
    }

    @Test
    public void invalidOperator2(){
        // given
        String[] parts = new String[]{"123", "x", "123"};
        // when
        // then
        assertThrows(InvalidOperatorException.class, () ->{
            new CalculationRequest(parts);
        });
    }

    @Test
    public void invalidOperator3(){
        // given
        String[] parts = new String[]{"123", "x", "123", "4"};
        // when
        // then
        assertThrows(BadRequestException.class, () ->{
            new CalculationRequest(parts);
        });
    }


}